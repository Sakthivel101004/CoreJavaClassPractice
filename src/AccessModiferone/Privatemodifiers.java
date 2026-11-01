package AccessModiferone;

public class Privatemodifiers {
	
	
	 private void primeth() {
		System.out.println("private modifiers");
	}
	public Privatemodifiers(){
		System.out.println("condtracotr for the private");
		
	}

	public static void main(String[] args) {
	
		Privatemodifiers pri=new Privatemodifiers();
		 pri.primeth();

	}

}
