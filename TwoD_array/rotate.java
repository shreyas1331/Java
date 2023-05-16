package TwoD_array;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int rows=sc.nextInt();
			int cols=sc.nextInt();
			int [][]numbers=new int [rows][cols];//2D array
			//INPUT
			//rows
			for(int i=0;i<rows;i++) {
				//columns
				for(int j=0;j<cols;j++) {
					numbers[i][j]=sc.nextInt();
				}
			}
	}

}
