package Array2;

public class practice1 {
	//    1
	//   121
	//  12321
	// 1234321

	public static void main(String[] args) {
		int n=4;
		for(int rows=1;rows<=n;rows++) {
			for(int sp=n-rows;sp>0;sp--) {
				System.out.print("0");
			}
			for(int colm=1;colm<=rows;colm++) {
				System.out.print(colm);
			}
			for(int k=rows-1;k>0;k--) {
				System.out.print(k);
			}
			
			System.out.println();
		}
	}

}
