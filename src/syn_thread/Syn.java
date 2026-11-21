package syn_thread;

public class Syn {

	
	synchronized void m1() {
		for(int i=1;i<6;i++) {
			System.out.println("m1 :"+i);
			try {
				Thread.sleep(1000);
				if(i==1) {
					wait();
					
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	
	synchronized void m2() {
		for(int i=6;i<11;i++) {
			System.out.println("me2 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		
		try {
			wait();
			
			System.out.println("me2 is completed");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	synchronized void m3() {
		for(int i=11;i<16;i++) {
			System.out.println("met3 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
		try {
			wait();
			
			System.out.println("me3 is completed");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	synchronized void release() {
		notify();
	}
	public static void main(String args[]) {
		
		Syn syn=new Syn();
		
		Thread t1=new Thread(()->syn.m1());
		Thread t2=new Thread(()->syn.m2());
		Thread t3=new Thread(()->syn.m3());
		Thread t4=new Thread(()->syn.release());
		
		
		t1.start();
		t2.start();
		t3.start();
		
		t4.start();
		

	}
}
