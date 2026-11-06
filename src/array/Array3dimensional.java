package array;

import java.util.Scanner;

public class Array3dimensional {
	
	Scanner scan=new Scanner(System.in);
	
	void multi() {
		
		System.out.println("3d array");
		
		System.out.println("Enter the no block:");
		int block=scan.nextInt();
		
		System.out.println("Enter the no row:");
		int row=scan.nextInt();
		
		System.out.println("Enter the no column:");
		int col=scan.nextInt();
		scan.nextLine();
		
		String [][][] arr=new String[block][row][col];
		
		for(int i=0;i<arr.length;i++) {    //block size
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					
					System.out.print("enter the vlaue for "+"["+i+"] "+"["+j+"] "+"["+k+"] :");
					arr[i][j][k]=scan.nextLine();
					
					
				}
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {    //block size
			for(int j=0;j<arr[i].length;j++) {
				
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println();
					
//					System.out.print( "["+i+"] ,"+"["+j+"] ,"+"["+k+"] :");
//					
//					System.out.println(arr[i][j][k]);
					System.out.print(arr[i][j][k]+" ");
					
				}
				System.out.println();
			}
			
		}
		
	}
	
	
	
	void task() {
		
		int []arr= {10,20,30,40,50,60};
		int key=50;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("index is :"+i);
			}
		}
	}
	
	public static void main(String args[]) {
		
		Array3dimensional Array3dimensional=new Array3dimensional();
		
//		Array3dimensional.multi();
		Array3dimensional.task();
		
		
		
	}

}
