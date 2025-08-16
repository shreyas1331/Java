package Sliding_VariableWindow;
import java.util.*;
public class q2_LongestSubstringK_UniqueCharacters  {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3; // for unique characters
        f(s, k, s.length());
    }
    public static void f(String s,int k,int n){
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0;    int maxi=0;
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j), 0)+1);
            if(map.size()<k)j++;
            else if(map.size()==k){
                maxi=Math.max(maxi,j-i+1);
                j++;
            }
            else if(map.size()>k){
                while(map.size()>k){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(maxi);
    }
}