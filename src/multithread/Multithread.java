package multithread;



public class Multithread extends Thread{
	
	
	public void loop() {
		for(int i=0;i<10;i++) {
			System.out.println("loop"+i);
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	public void run() {
		for(int i=0;i<=50;i++ ) {
			if(i%5==0) {
				System.out.println("run"+i);
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
