package Hash_Map1;
import java.util.*;
public class Isomorphic_String {

	public static void main(String[] args) {
		String s="egg";
		String t="add";
		System.out.println(Isomorphic(s,t));
	}
	public static boolean Isomorphic(String s,String t) {
		HashMap<Character,Character> hm=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			Character sch=s.charAt(i);//e  g  g
			Character tch=t.charAt(i);//a  d  d
			if(hm.containsKey(sch)) {//g
				if(hm.get(sch)!=tch)//d==d
					return false;
			}
			else if(hm.containsValue(tch)) {//d
				return false;
			}
			else {
				hm.put(sch,tch);
			}
		}
		return true;
	}

}
