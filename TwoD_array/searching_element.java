package TwoD_array;

import java.util.Scanner;

public class searching_element {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int rows = sc.nextInt();
			   int cols = sc.nextInt();


			   int[][] numbers = new int[rows][cols];
			   //input
			   for(int i=0;i<rows;i++) {
				   for (int j=0;j<cols;j++) {
					   numbers[i][j]=sc.nextInt();
				   }
			   }
			   boolean flag = false;
			   int x=sc.nextInt();
			   int i,j=0;
			   for( i=0;i<rows;i++) {
				   for( j=0;j<cols;j++) {
					   //compare with x
					   if (numbers[i][j]==x) {
						   flag = true;
						   break;
					   }
				   }
				   if(flag) {
					   break;
				   }
			   }
			   if(flag) {
				   System.out.println("x found at location ("+i+","+j+")");
			   }else {
				   System.out.println("Not found");
			   }
		}

	}

}
