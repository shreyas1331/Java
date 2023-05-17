package Easy2_patterns;

public class left_triangle {
	//1
	//12
	//123
	//1234
	public static void main(String[] args) {
		int n=4;
		int rows=1;
		while(rows<=n) {
			int colm=1;
			while(colm<=rows) {
				System.out.print(colm);
				colm++;
			}
			System.out.println();
			rows++;
		}
	}

}//u can use 
//1.rows
//2.colm
//3.using count
//4.using value=rows
//5.using rows-colm+1
