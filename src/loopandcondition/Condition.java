package loopandcondition;
import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the Student Mark:");
		int mark=scan.nextInt();
		
		
		if(mark<=100 &&  mark>=91) {
			System.out.println("grade:O");
		}
		else if(mark <=90 && mark>=81) {
			System.out.println("grade:A+");
			
		}
		else if(mark <=80 && mark>=71) {
			System.out.println("grade:A");
			
		}
		else if(mark <=70 && mark>=61) {
			System.out.println("grade:B+");
			
		}
		else if(mark <=60 && mark>=51) {
			System.out.println("grade:B");
			
		}
		else if(mark>100 || mark<0){
			System.out.println("!!!"+ mark +"  is not valid mark ");
			
		}
		
		else{
			System.out.println("grade:U");
			
		}

	}

}
