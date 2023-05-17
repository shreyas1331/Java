package HardPatterns;

public class hardpatterns {
	//   1
	//  121
	// 12321
	//1234321

	public static void main(String[] args) {
		int n=4;
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
				System.out.print(colm);
				colm++;
			}
			int start=rows-1;
			while(start!=0) {
				System.out.print(start);
				start--;
			}
			System.out.println();
			rows++;
		}
	}

}
