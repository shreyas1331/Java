package Strings2;

public class GFG_leftnon_repeating {

	public static void main(String[] args) {
		String s="geeksforgeeks";
		int ans=solve(s);
		System.out.println(ans);
	}
	public static int solve(String s) {
		int[]count=new int[256];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++) {
			if(count[s.charAt(i)]==1) {
				return i;
			}
		}
		return -1;
	}

}
