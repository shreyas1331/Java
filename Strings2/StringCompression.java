package Strings2;
import java.util.*;
public class StringCompression {
//INPUT=aaabddee
//OUTPUT=a3bd2e2
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
//		String s="aaabddee";
		String ans=""+s.charAt(0);
		int count=1;                             //a
		for(int i=1;i<s.length();i++) {
			char curr=s.charAt(i);               //2nd a
			char prev=s.charAt(i-1);             //prev a(i.e 1st a)
			if(curr==prev) {
				count++;
			}
			else {
				ans=ans+count;
				count=1;
				ans=ans+curr;
			}
		}
		ans=ans+count;
		System.out.println(ans);
	}

}
