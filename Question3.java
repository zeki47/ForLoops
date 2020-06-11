package assignments.ForLoop;

public class Question3 {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=5;i<=50; i++) {
			
			if(i%2==0) {
				count++;
			}
		
		}System.out.println("Number of even numbers: " + count);

	}

}
