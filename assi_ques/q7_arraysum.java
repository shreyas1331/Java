package assi_ques;

import java.util.Scanner;

public class q7_arraysum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       int size = sc.nextInt();
	       int numbers[] = new int[size];
	       
	       int sum=0;
	       //input
	       for(int i=0; i<size; i++) {
	           numbers[i] = sc.nextInt();
	       }
		//print the numbers in array
	       for(int i=0; i<numbers.length; i++) {
	    	   sum=sum+numbers[i];
	           }
	       System.out.print(sum);
	}
	}


