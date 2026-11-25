package innerclass;

public class Outerclass {
	
	class inner {
		
		void ishow() {
			System.out.println("ishow in the inner class");
		}
		
	}
	
	static class inner1{
		static void speed() {
			System.out.println("speed in the static inner class satic method ");
		}
		
		void ishow() {
			System.out.println("ishow in the static class default method");
		}
	}

	public static void main(String[] args) {
		
		Outerclass outer=new Outerclass();
		Outerclass.inner in=outer.new inner();
			
		in.ishow();
		
		
		Outerclass.inner1.speed();
		
	
	}

}
