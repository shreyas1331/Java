package Strings2;
import java.util.*;
public class GoodSubString {

	public static void main(String[] args) {
//		String s="cbaeicde";
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i=0;
		int ans=0;
		int count=0;
		while(i<s.length()) {
			char ch=s.charAt(i);
			if(isvov(ch)) {
				count++;
			}else {
				ans=Math.max(ans, count);
				count=0;
			}
			i++;
		}
		System.out.println(ans);
		
	}

	private static boolean isvov(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o')
		return true;
	
	return false;
	}
	
}
