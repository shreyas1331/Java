package Easy_patterns;

public class simplepattern {

	public static void main(String[] args) {
		int n=4;//given
		int rows=1;
		while(rows<=n) {
			int colm=1;
			while(colm<=n) {
				System.out.print(n-rows+1);//u can use "*" & column
				colm++;				// and now see the output
			}
			System.out.println();
			rows++;
		}
	}

}//use all these to see outputs
//1. "*"
//2.colm
//3.rows
//4.n-colm+1
//5.n-rows+1