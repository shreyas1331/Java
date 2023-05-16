package assi_ques;
//Write a program to find x to the power n (i.e. x^n).
//Take x and n from the user. 
//You need to print the answer.
import java.util.Scanner;

public class q3_pow {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x=sc.nextInt();//3
			int n=sc.nextInt();//4
			int pow=1;
			for(int i=1;i<=n;i++) {
				pow=pow*x;     //(1*3)(3*3)(9*3)(27*3)
			}
			System.out.println(pow);//81
		}
		
	}

}
