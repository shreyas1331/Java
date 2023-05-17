package HardPatterns;

public class pattern_mountain {

	public static void main(String[] args) {
		int n=5;
		int t=n;
		int colm;
		for(int rows=1;rows<=n;rows++) {
			for( colm=1;colm<=rows;colm++) {
				System.out.print(colm+"  ");
			}
			for(int sp=(2*t)-3;sp>0;sp--) {
				System.out.print("0  ");
				
			}t=t-1;
			colm--;
			for(int i=1;i<=rows;i++) {
				if(rows==n && colm==n) { colm--;i++;}
				System.out.print(colm+"  ");
				colm--;
			}
			System.out.println();
		}
	}

}
