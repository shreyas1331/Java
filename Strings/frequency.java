package Strings;
import java.util.*;
public class frequency {
//MAXIMUM FREQUENCY CHARACTER
//INPUT=aaabacb
//OUTPUT=a
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();//aaabacb
//		StringBuilder sb=new StringBuilder(str);
//		int[]freq=new int[26];
//		for(int i=0;i<sb.length()-1;i++) {
//			freq[i]=1;
//			for(int j=i+1;j<sb.length();j++) {
//				if(sb.charAt(i)==sb.charAt(j)) {
//					freq[i]++;
//					sb.setCharAt(j,'0');
//				}
//			}
//		}
//		int max=freq[0];
//		int index=0;
//		for(int i=0;i<=freq.length-1;i++) {
//			if(freq[i]>max) {
//				max=freq[i];
//				index=i;
//			}
//		}
//		System.out.println(sb.charAt(index));
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int arr[]=new int[26];//abb
//        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=1;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            if(arr[i]>arr[ans]){
                ans=i;
            }
        }
        System.out.print((char)(ans+'a'));


	
	}

}
