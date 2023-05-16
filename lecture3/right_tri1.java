package lecture3;

public class right_tri1 {
	//***
	//**
	//*

	public static void main(String[] args) {
		int n=4;
		int rows=1;
		while(rows<=n) {
			int colm=1;
			while(colm<=n-rows) {
				System.out.print("*");
				colm++;
			}
			System.out.println();
			rows++;
		}
	}

}
