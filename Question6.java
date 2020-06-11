package assignments.ForLoop;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Write a Fibonacci series of n terms where n is declared by user:
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n = scanner.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		
		System.out.print(firstTerm+", "+secondTerm+", ");
		
		for(int i=3; i<=n; i++) {
			int nthTerm=firstTerm+secondTerm;
			System.out.print(nthTerm+", ");
			firstTerm=secondTerm;
			secondTerm=nthTerm;
		}

	}

}
