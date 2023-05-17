package Strings;

import java.util.Scanner;

public class Non_Repeating_Character {
	public static void solve(Scanner sc){
        String s=sc.next();//codingblocks
        int arr[]=new int[26];//array bnao
        int curr;
        for(int i=0;i<s.length();i++){
            curr=s.charAt(i)-'a';
            arr[curr]+=1;
        }
        for(int i=0;i<s.length();i++){
            curr=s.charAt(i)-'a';
            if(arr[curr]==1){
                System.out.println((char)s.charAt(i));
                return;
            }
        }
        System.out.println(-1);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n--!=0){
            solve(sc);
	}

	}
}