package lecture3;

public class right_triangle {

	public static void main(String[] args) {
		//to print
		//  *
		// **
		//***
		int n=3;
		int rows=1;
		int sp;
		while(rows<=n) {
			sp=n-rows;
			while(sp!=0) {
				System.out.print(" ");
				sp--;
			}
			int colm=1;
			while(colm<=rows) {
				System.out.print("*");
				colm++;
			}
			System.out.println();
			rows++;
		}
	}

}
