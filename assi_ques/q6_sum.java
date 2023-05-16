package assi_ques;

import java.util.Scanner;

public class q6_sum {
	// Write a program to input an integer N and print the sum of all its 
	// even digits and sum of all its odd digits separately.
	// Digits means numbers not the places. That is, if the given integer is "13245", 
	// even digits are 2 & 4 and odd digits are 1, 3 & 5.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int e=0;
		int o=0;
		while(n!=0) {
			int temp=n%10;
            if(temp%2==0)
            {e+=temp;}
            if(temp%2!=0)
            {o+=temp;}
            n=(int)(n/10);
		}
		System.out.println(e+" "+o);
	}

}
