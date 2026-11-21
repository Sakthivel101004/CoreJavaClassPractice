package multithread;

public class Anotherthreadinterface extends Parent implements Runnable {

	
	public void run() {
	
		for(int i=0;i<=100;i++) {
			
			if(i%10==0) {
			System.out.println("run 2 "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
	
	
	public void eight() {
for(int i=0;i<=100;i++) {
			
			if(i%8==0) {
			System.out.println("eight"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		
	}
	

}
