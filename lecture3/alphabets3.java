package lecture3;

public class alphabets3 {

	public static void main(String[] args) {
		int n=4;
		int rows=1;
		char value='A';
		while(rows<=n) {
			int colm=1;
			while(colm<=rows) {
				System.out.print(value);
				value++;
				colm++;
			}
			System.out.println();
			rows++;
		}
	}

}
//A
//BC
//DEF

