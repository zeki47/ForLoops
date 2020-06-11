package assignments.ForLoop;

public class Question9 {

	public static void main(String[] args) {
		
		int i=1;
		int number=21;
		
		while(i<=number) {
			
			if(i%2==1) {
				
				if(i==number|i==(number-1)) {
					System.out.print(i);
				}else {
				System.out.print(i + ",");
				}
			}
			i++;
	
		}

	}

}
