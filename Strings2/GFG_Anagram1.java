package Strings2;

public class GFG_Anagram1 {
	public static boolean isAnagram(String s, String t) {
        
	       if(s.length()!= t.length()) return false;
	        
	       int [] arr = new int[26];
	       for(int i =0 ; i<s.length();i++) {
	            arr[s.charAt(i)-'a']++;
	            arr[t.charAt(i)-'a']--;
	       }
	       for(int i = 0 ; i<arr.length ; i++) {
	           if(arr[i]!=0) {
	               return false;
	           }
	       }
	       return true;
	    }
	public static void main(String[] args) {
		String s="hello";
		String t="ellos";
		System.out.println(isAnagram(s,t));
		System.out.println(anagramGFG(s,t));
	}
	public static boolean anagramGFG(String s,String t) {
		int[]count=new int[26];
		if(s.length()!=t.length()) return false;
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
			count[t.charAt(i)-'a']--;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) return false;
		}
		return true;
	}

}
