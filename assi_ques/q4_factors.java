package assi_ques;

import java.util.Scanner;

public class q4_factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.print(i+",");
				
			}
//			else
//				System.out.print("no output");
//			
		}
	}

}
