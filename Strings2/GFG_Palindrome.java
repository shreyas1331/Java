package Strings2;

public class GFG_Palindrome {

	public static void main(String[] args) {
		String s = "shrhs";
		boolean ans = palindrome(s);
		System.out.println(ans);
	}

	public static boolean palindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}

// String s="abcba";
// int i=0;
// int j=s.length()-1;
// boolean flag=true;
// while(i<j) {
// if(s.charAt(i)!=s.charAt(j)) {
// flag=false;
// break;
// }
// i++;
// j--;
// }
// if (flag==false) {
// System.out.println("it is not palindrome");
// }
// if(flag==true) {
// System.out.println("it is palindrome");
// }
// Scanner sc=new Scanner(System.in);
// String s=sc.nextLine();
// int i=0;
// int j=s.length()-1;
// boolean flag=true;
// while(i<j) {
// if(s.charAt(i)!=s.charAt(j)) {
// flag=false;
// break;
// }
// i++;
// j--;
// }
// if(flag==false) {
// System.out.println("it is not");
// }
// if(flag==true) {
// System.out.println("it is ");
// }
