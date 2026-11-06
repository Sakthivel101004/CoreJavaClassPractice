package Recursion;

public class Main {
	
	
	
	void five(int num) {
		if(num==101) {
			return;
		}
		if(num%5==0) {
			System.out.println(num);
		}
		num++;
		five(num);
		
		
		
		
	}
	public static void main(String []args) {
		Main ex=new Main();
		ex.five(1);
		
		
		
		
		
	 
	}

}
