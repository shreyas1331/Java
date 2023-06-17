package Array2;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		try (//1st method 
		//		int[] marks = new int[3];
		//		marks[0] = 97;
		//		marks[1] = 98;
		//		marks[2] = 95;
				//2nd method
		//		int[] marks = {98, 97, 95};
		Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			   int numbers[] = new int[size];


			   for(int i=0; i<size; i++) {
			       numbers[i] = sc.nextInt();
			   }


			   
			//print the numbers in array
			   for(int i=0; i<numbers.length; i++) {
			       System.out.print(numbers[i]+" ");
			   }
		}


	}

}
