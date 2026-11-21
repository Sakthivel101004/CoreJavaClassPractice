package syn_thread;

public class Syn_thread1 {
	
	void booking() {
		
		for(int i=0;i<6;i++) {
			System.out.println("booking "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
