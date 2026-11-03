package array;
import java.util.Scanner;

public class Array2dimensional {
	
	static Scanner scan=new Scanner(System.in);
	
	static void array_arr() {
		
		System.out.println(" 2 dimensional program");
		
		System.out.print("enter the no row: ");
		int row=scan.nextInt();
		System.out.print("enter the no column: ");
		int col=scan.nextInt();
		
		
		int [][]arr=new int[row][col];
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("enter the value for the ["+i+","+j+"] :");
				arr[i][j]=scan.nextInt();
			}
			
		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//				
//			}
//			System.out.println();
//		}
		
//		using enhanced for loop
		for(int[] a1:arr) {
			for(int a2:a1) {
				System.out.print(a2+" ");
				
				
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Array2dimensional.array_arr();
	
		
//		int arr[][]= {   {10,20,30},{40,50,60},{70,80,90}  };
//		System.out.println(arr[0].length);
//		
////	for(int[] arrs:arr) {
////		for(int arrss:arrs)
////		System.out.print(arrss +" ");
////		System.out.println();
////		
////	}
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//				
//				
//				
//			}
//			System.out.println();
//		}
		
		
		
	
		

	}

}
