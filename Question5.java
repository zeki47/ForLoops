package assignments.ForLoop;

public class Question5 {

	public static void main(String[] args) {
		
		int number=12;
		
		System.out.println("Multiplication table for " + number);
		System.out.println("--------------------------");
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(number + "X" + i + "=" + (number*i));
		}


	}

}
