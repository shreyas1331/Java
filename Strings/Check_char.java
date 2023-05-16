package Strings;
import java.util.*;
public class Check_char {
//question1,2
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Helol";
		
		if(s1.length()==s2.length())
		{
			char[] str1=s1.toCharArray();
			char[] str2=s2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			boolean result = Arrays.equals(str1,str2);
			if(result) {
				System.out.println("it is anagram");
			}
			
		}else {
			System.out.println("it is not");
		}
		
	}

}
