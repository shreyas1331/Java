package Strings;

import java.util.Scanner;

public class Toggle {
//INPUT  ->   PhysICS
//OUTPUT ->   pHYSics
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 StringBuilder str=new StringBuilder(sc.nextLine());
		 for(int i=0;i<str.length();i++)
		 {
			 boolean flag=true;//capital
			 char ch=str.charAt(i);//A
			 int asci=(char)ch;//65
			 if(asci>=97) flag=false;//small
			 if(flag==true)
			 {
				 asci+=32;//97
				 char dh=(char)asci;//a
				 str.setCharAt(i, dh);
			 }
			 else
			 {
				 asci-=32;
				 char dh=(char )asci;
				 str.setCharAt(i, dh);
			 }
		 }
		 System.out.print(str);
	}

}
