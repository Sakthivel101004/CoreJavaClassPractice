package Interface;
import java.util.Scanner;
public class Addimplement implements Calculator,Stringinterface{
	Scanner scan=new Scanner(System.in);

	@Override
	public void add() {
		System.out.println(" enter the value for A");
		int a=scan.nextInt();
		System.out.println(" enter the value for B");
		int b=scan.nextInt();
		System.out.println("Add: "+ (a+b));
		
	}
	
	public void concats() {
		System.out.println("enter the first name");
		String fname=scan.nextLine();
		System.out.println("enter the last name");
		String lname=scan.nextLine();
		System.out.println("full name is"+ fname+lname);
	}

}
