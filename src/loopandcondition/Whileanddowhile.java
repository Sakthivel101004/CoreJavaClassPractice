package loopandcondition;

public class Whileanddowhile {

	public static void main(String[] args) {
		
		
		System.out.println("while loop print the no which is divided by 6");
		
		int i=1;
		while(i<=50) {
			if(i%6==0) {
				System.out.println(i);
			
			}
			i++;
		}
		
		System.out.println("using continue for the no");
		i=1;
		while(i<=50) {
			if(i%6!=0) {
				i++;
				continue;
			
			}
			System.out.println(i);
			i++;
		}
		
		
		
		System.out.println("continue in the while loop skip 6");
		int j=0;
		while(j<10) {
			
			if(j==6) {
				j++;
				continue;
			}
			
			System.out.println(j);
			j++;
		}
		

	}

}
