package Hash_Map1;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		String s="hello";
		String t="ehlol";
		System.out.println(validAnagram(s, t));
	}
	static HashMap<Character,Integer> makefreq(String str){
		HashMap<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			Character ch=str.charAt(i);
			if(!mp.containsKey(ch)) {
				mp.put(ch,1);
			}else {
				int currFreq=mp.get(ch);
				mp.put(ch, currFreq+1);
			}
		}
		return mp;
	}
	public static boolean validAnagram(String s,String t) {
		if(s.length()!=t.length()) return false;
		HashMap<Character,Integer> hm1=makefreq(s);
		HashMap<Character,Integer> hm2=makefreq(t);
		return hm1.equals(hm2) ;
		
	}

}
