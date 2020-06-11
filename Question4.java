package assignments.ForLoop;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
			
		
			int product=0;
			
			while(product<100) {
				
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter your number:");
				int number = scanner.nextInt();
				product=number*10;
				
			}
			//System.out.println("Done!");
		
		
	}

}
