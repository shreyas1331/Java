package Easy2_patterns;

public class alphabets {

	public static void main(String[] args) {
		int n=3;
		int rows=1;
		int alphabet=65;
		while(rows<=n) {
			int colm=1;
			while(colm<=n) {

				System.out.print((char)(alphabet+colm-1));
				colm++;
			}
			System.out.println();
			rows++;
		}
	}
}
//u can use 
//1.alphabet+colms-1
//2.alphabet+rows-1
//3.(char)('A'+count-1)