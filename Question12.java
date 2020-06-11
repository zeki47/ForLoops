package assignments.ForLoop;

public class Question12 {

	public static void main(String[] args) {
		
		int rows=1;
		
		for(int i=1;i<=10; i++) {
			
			for(int j=rows;j<=10*rows; j+=rows) {
				
			System.out.print(j + " ");
			
			}
			System.out.println();
			rows++;

		}
	
	}
		

}
