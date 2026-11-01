package abstractclass;

public class Implement_1 extends Abstractclass {
	private String name;
	private String feedback;
	
	public void collect(String name,String feedback) {
		this.name=name;
		this.feedback=feedback;
		
	}
	public void display(String name,String feedback) {
		
		System.out.println("Name:"+this.name);
		System.out.println("Feedback:"+this.feedback);
		System.out.println();
		
	}
	

}
