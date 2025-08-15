package Sliding_FixedWindow;
import java.util.*;
public class q5_lengthOfLongestSubstring {
    public static void main(String[]args){
        String s="abcabcbb";
        solve(s,s.length());
    }
    public static void solve(String s,int n){
        HashSet<Character> set=new HashSet<>();
        int i=0; int maxi=0;
        for(int j=0;j<n;j++){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                maxi=Math.max(maxi,j-i+1);
            }else{
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
            }
        }
        System.out.println(maxi);
    } 
}