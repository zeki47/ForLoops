package assignments.ForLoop;

public class Question8 {

	public static void main(String[] args) {
		
		int i=1;
		int number=100;
		int sum=0;
		
		while(i<=number) {
			sum=sum+i;
			i++;
		}
		System.out.println("Sum: " + sum);
	}

}
