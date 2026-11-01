package abstractclass;

public class Main {

	public static void main(String[] args) {
		
		Abstractclass i1 = new Implement_1();
		
		i1.collect("sakthi","good");
		i1.display("mani","bad");
		
		
		
		
		Abstractclass i2 = new Implement_2();
		i2.collect("sakthi","bad");
		i2.display("mani","good");

	}

}
