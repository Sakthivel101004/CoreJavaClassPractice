package exception;

public class Bank {
	
	public void amt(int bal) {
		
		if(bal<=0) {
			throw new Balance500("balance is 0 ");
		}
		
		else if(bal<500) {
			throw new Balance500("maintain the balance above 500");
		}
		else if(bal>500000) {
			try {
			throw new Maxbalance500000("max limit is 500000");
			}
			catch(Maxbalance500000 e){
				System.out.println(e);
				
			}
		}
		else {
			System.out.println(bal);
		}
	}
 static void main(String[] args) {
	
		Bank bank=new Bank();
		
		try {
		bank.amt(700000000);
		}
		catch(Balance500 e){
			System.out.println(e);
			
			
		}

	}

}
