package Strings2;

public class GFG_CheckSubstring {

	public static void main(String[] args) {
		String s="geeksforgeeks";
		String r="foree";
		boolean ans=check(s,r);
		System.out.println(ans);
	}
	public static boolean check(String s,String r) {
		int i=0, j=0;
		while(i<s.length() && j<r.length()) {
			if(s.charAt(i)==r.charAt(j)) {
				i++;
				j++;
			}else {
				i++;
			}
		}
		return j==r.length();
	}

}
