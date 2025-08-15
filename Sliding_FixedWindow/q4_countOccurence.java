package Sliding_FixedWindow;

import java.util.HashMap;

public class q4_countOccurence {
    public static void main(String[] args) {
        String sentence="aabacaaba";
		String pattern="aaab";
		int k=pattern.length();
		f(sentence,pattern,k);
    }
    public static void f(String s,String pat,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:pat.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        int cnt=map.size();
        int i=0,j=0;
        while(j<s.length()){
            char charj=s.charAt(j);
            if(map.containsKey(charj)){
                map.put(charj,map.get(charj)-1);
                if(map.get(charj)==0){
                    cnt--;
                }
            }
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                if(cnt==0) System.out.println("at index"+i);
                char chari=s.charAt(i);
                if(map.containsKey(chari)){
                    map.put(chari, map.get(chari)+1);
                    if(map.get(chari)==1){
                        cnt++;
                    }
                }
                i++;
                j++;
            }
        }
    }
}
