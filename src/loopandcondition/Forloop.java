package loopandcondition;

public class Forloop {
	
	void fors() {
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}
	
	
	
	public static void main(String[]args) {
		System.out.println("forloop");
		
		Forloop loop=new Forloop();
		loop.fors();
	}

}
