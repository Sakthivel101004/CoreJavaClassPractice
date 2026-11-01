package abstractclass;

public class Implement_2 extends Abstractclass{
	
	private String name;
	private String feedback;
	
	public void collect(String name,String feedback) {
		this.name=name;
		this.feedback=feedback;
		System.out.println(this.name+ this.feedback);
		
	}
	public void display(String name,String feedback) {
		
		System.out.println("Name:"+ name);
		System.out.println("Feedback:"+ feedback);
		
	}

}
