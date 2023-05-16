package Strings;

import java.util.Scanner;

public class whitespace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ans="";
		StringBuilder str=new StringBuilder(sc.nextLine());
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			else {
				ans=ans +str.charAt(i);
			}
		}
		System.out.print(ans);

	}

}
