package exception;

public class Main {

	public static void main(String[] args) {
		System.out.println(" Run time Exception");
		
		
		try {             //Arithmetic Exception
			int a =10,b=0;
			int c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException  e){
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("Arithmetic Exception is executed");
		}
		
		
		try {
		String name=null;
		System.out.println(name.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println(e);
			
		}
		
		
		try {
			String name="ssss";
			System.out.println(name.charAt(5));
		}
        catch(StringIndexOutOfBoundsException e) {
        	System.out.println(e);
        }
		
		
		try {
			String name[]= {"ss","fgf"};
			System.out.println(name.length);
			System.out.println(name[5]);
		}
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println(e);
        }
		try {
			String n="d234";
			int nn=Integer.valueOf(n);
			System.out.println(nn);
			
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
		
		
	}

}
