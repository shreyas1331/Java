package lecture4;

public class fibonnaci_pattern {

	public static void main(String[] args) {
		int n=4;
		int a=0,b=1,c=0;
		for(int rows=1;rows<=n;rows++) {
			for(int colm=1;colm<=rows;colm++) {
				System.out.print(c+" ");
				a=b;
				b=c;
				c=a+b;
			}
			System.out.println();
		}
	}

}
