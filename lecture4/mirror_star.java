package lecture4;

public class mirror_star {

	public static void main(String[] args) {
		int n=5;
		for(int rows=1;rows<=(n/2)+1;rows++) {
			for(int sp=(n/2)+1-rows;sp>=1;sp--) {
				System.out.print(" ");
			}
			for(int colm=1;colm<=2*rows-1;colm++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int rows=(n/2);rows>=1;rows--) {
			for(int sp=(n/2)+1-rows;sp>=1;sp--) {
				System.out.print(" ");
			}
			for(int colm=1;colm<=2*rows-1;colm++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
