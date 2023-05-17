package Easy2_patterns;

public class alphabets1 {

	public static void main(String[] args) {
		int n=3;
		int rows=1;
		while(rows<=n) {
			int colm=1;
			while(colm<=n) {
				System.out.print((char)('A'+rows+colm-2));
				colm++;
			}
			System.out.println();
			rows++;
		}
	}

}
//output is :  
//ABC
//BCD
//CDE