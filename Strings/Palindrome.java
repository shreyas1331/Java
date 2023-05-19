package Strings;

public class Palindrome {

	public static void main(String[] args) {
		String s="abcb";
		char ch=s.charAt(0);
		char sh=s.charAt(s.length()-1);
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if(ch==sh)
			{
				flag=true;
				break;
			}
			else {
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println(flag);
		}
		if(flag==false)
		{
			System.out.println(flag);
		}
	}

}
