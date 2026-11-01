package Interface;

public class Accessmodifer {
	
	 static String name ="null";
	
	static void method1() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
//		Accessmodifer mainclass=new Accessmodifer();
		Accessmodifer.method1();
		
//		mainclass.name="sakthivel";
//		
//		System.out.println(mainclass.name="sakthivel");
		System.out.println(Accessmodifer.name);
		
	

	}

}
