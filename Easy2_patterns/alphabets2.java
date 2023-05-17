package Easy2_patterns;

public class alphabets2 {

	public static void main(String[] args) {
		int n=3;
		int rows=1;
		int alphabet=65;
		while(rows<=n) {
			int colm=1;
			while(colm<=rows) {
				System.out.print((char)(alphabet+rows-1));
				colm++;
			}
			System.out.println();
			rows++;
		}
	}

}
//A
//BB
//CCC