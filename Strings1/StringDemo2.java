package Strings1;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="abc";
		str=str+"xyz";   //new string is formed
		System.out.println(str);
		
		//SUBSTRING(i,j)  &  SUBSTRING(i)(continuous part of string)
		System.out.println(str.substring(0, 4));
		 
		
		String s="physics";
		for(int j=2;j<4;j++)
		{
			System.out.println(s.substring(j));
		}
	}

}
