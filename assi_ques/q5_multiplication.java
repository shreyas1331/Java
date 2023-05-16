package assi_ques;

import java.util.Scanner;
//Write a program to print multiplication table of n
//Input Format :
//A single integer, n
//Output Format :
//First 10 multiples of n each printed in new line

public class q5_multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.print(n*i);
			System.out.println();
		}
		
	}

}
