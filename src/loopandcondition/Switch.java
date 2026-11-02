package loopandcondition;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int option=0;
	
		do {
		Scanner scan=new Scanner(System.in);
		
		
		
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mult");
		System.out.println("4.Div");
		System.out.print("Enter you option:");
		 option=scan.nextInt();
		
		System.out.print("enter the val1:");
		int val1=scan.nextInt();
		System.out.println();
		System.out.print("enter the val2:");
		int val2=scan.nextInt();
		
		switch(option) {
		 
		case 1:
			System.out.println("Add: "+(val1+val2));
			break;
		case 2:
			System.out.println("sub: "+(val1-val2));
			break;
			
		case 3:
			System.out.println("mul: "+(val1*val2));
			break;
		case 4:
			System.out.println("div: "+(val1/val2));
			break;
		default:
			System.out.println("enter the valid option");
		
		}
		}
		while(option!=4);

	}

}
