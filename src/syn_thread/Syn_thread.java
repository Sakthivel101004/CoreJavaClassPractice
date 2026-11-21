package syn_thread;

public class Syn_thread {
	
	synchronized void food() {
		for(int i=0;i<=10;i++) {
			System.out.println("food "+i);
			try {
				Thread.sleep(1000);
				wait();
			} catch (InterruptedException e) {
				
				System.out.println(e.getMessage());
			}
			
			
			
		}
		
		
	}
	
	
	synchronized void location() {
		for(int i=0;i<=5;i++) {
			System.out.println("location "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				System.out.println(e.getMessage());
			}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	
      void delivered() {
		for(int i=0;i<4;i++) {
			System.out.println("delivered "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		
	}
      
      
      synchronized void release() {
    	 notifyAll();
      }
      public static void main(String args[]) {
    	  Syn_thread syn_thread=new Syn_thread();
    	  
    	  Syn_thread1 Syn_thread1=new Syn_thread1();
    	  
    	  Thread t1=new Thread(()->syn_thread.food());
    		  
    	  Thread t2=new Thread(()->syn_thread.location());
    	  Thread t3=new Thread(()->syn_thread.delivered());
    	  
    	 // Thread t4=new Thread(()->Syn_thread1.booking());
    	  
    	  Thread t5=new Thread(()->syn_thread.release());
    	  
    	  t1.start();  //food  syn
    	  t2.start();  //location   syn
    	
    	  t3.start();  //delivered 
    	  //t4.start(); //book
    	 t5.start();
      }

}
