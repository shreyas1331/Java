package Easy2_patterns;

public class pattern5{

	public static void main(String[] args) {
		//****
		// ***
		//  **
		//   *
		int n=5;
		int rows=1;
		while(rows<=n) {
			int spaces=1;
			while(spaces<rows) {
				System.out.print(" ");
				spaces++;
			}
			int colm=n;
			while(colm>=rows) {
				System.out.print("*");
				colm--;
			}
			System.out.println();
			rows++;
		}
	}

}
