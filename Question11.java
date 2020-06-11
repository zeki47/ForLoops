package assignments.ForLoop;

public class Question11 {

	public static void main(String[] args) {
		
		int rows=4;
		int upperBound=4;
		
		for(int i=1;i<=rows;i++) {
			
			
			for(int j=upperBound;j>=1;j--) {
				
				System.out.print(j + " ");
			}
			upperBound--;
			System.out.println();
			System.out.print(" ");
		}//4 3 2 1
          //3 2 1--------alignment
	}        

}
