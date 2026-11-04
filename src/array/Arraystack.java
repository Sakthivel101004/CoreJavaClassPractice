package array;

import java.util.Scanner;





public class Arraystack {
	Scanner scan =new Scanner(System.in);
	
	void practice() {
		
		System.out.print("enter the array length:");
		int no=scan.nextInt();
	
		int[]arr=new int[no];
		System.out.println("array len: "+no);
		int length=arr.length;
		
		for(int i=0;i <length;i++) {
			System.out.print("enter the no "+(i+1)+": ");
			arr[i]=scan.nextInt();
			
		}
		for(int nums:arr) {
			System.out.println(nums);
		}
		
		
		
		
	}
	
	void Stringpractice(){
		
		
		System.out.println("enter the array length: ");
		int len=scan.nextInt();
		scan.nextLine();
		
		String[]arr=new String[len];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the name"+(i+1)+" : ");
			arr[i]=scan.nextLine();
			
			

		}
		for(String names:arr) {
			System.out.println(names);
		}
		
		
		
	}
	
	public static void main(String []args) {
		
		
		int[]arr= {1,2,3,4,5};
		System.out.println(arr[1]);
		System.out.println(arr.length);
		System.out.println("enhanced loop");
		for(int arrs:arr) {
			System.out.println(arrs);
		}
		
		
		Arraystack pro=new Arraystack();
    	pro.practice();
		
		
		pro.Stringpractice();
		
		 
		
	}

}
