package Easy1_patterns;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		****
//		 ***
//		  **
//		   *
		int n=4;
		for(int rows=0;rows<=n;rows++) {
			for(int spaces=0;spaces<rows;spaces++) {
				System.out.print(" ");
			}
			for(int colm=n-rows;colm>=1;colm--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
