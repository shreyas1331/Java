package Strings2;

public class GFG_Frequency{

	public static void main(String[] args) {
		String str="geeksforgeeks";
		solve(str);
	}
	public static void solve(String s) {
		int[] count=new int[26];
		for(int i=0;i<s.length();i++) {
			count[(s.charAt(i)-'a')]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
				System.out.print((char)(i+'a')+" "+count[i]+",");
			}
		}
	}

}
