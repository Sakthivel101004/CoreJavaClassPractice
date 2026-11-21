package multithread;

public class Main {

	public static void main(String[] args) {
	
		
		Multithread multithread=new Multithread();
		multithread.start();
		multithread.loop();
		System.out.println("loop completed");
	
		
		
		Anotherthreadinterface  anotherthreadinterface =new Anotherthreadinterface ();
		Thread thread=new Thread(anotherthreadinterface);
		thread.start();
		
		System.out.println(multithread.isAlive());
		
		System.out.println(thread.isAlive());
		if(multithread.isAlive()) {
			System.out.println("first therad is live");
		}
		else {
			System.out.println("first thrad is not alive");
		}
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                      
		anotherthreadinterface.eight();
		anotherthreadinterface.evenno();  

	}

}
