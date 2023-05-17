package HardPatterns;

public class hard2 {

	public static void main(String[] args) {
		//*
		//**
		//***
		//**
		//*
		int n=5;
		for(int rows=0;rows<2*n-1;rows++) {
			if(rows<n) {
				for(int colm=0;colm<=rows;colm++) {
					System.out.print("*");
				}
			}
			else
			{
				for(int colm=0;colm<=2*n-1-rows-1;colm++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
