package Strings2;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
//		String s="abcba";
//		int i=0;
//		int j=s.length()-1;
//		boolean flag=true;
//		while(i<j) {
//			if(s.charAt(i)!=s.charAt(j)) {
//				flag=false;
//				break;
//			}
//			i++;
//			j--;
//		}
//		if (flag==false) {
//			System.out.println("it is not palindrome");
//		}
//		if(flag==true) {
//			System.out.println("it is palindrome");
//		}
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i=0;
		int j=s.length()-1;
		boolean flag=true;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag==false) {
			System.out.println("it is not");
		}
		if(flag==true) {
			System.out.println("it is ");
		}
	}

}
