package Strings;

import java.util.Scanner;

public class Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' && i>0)
			{
				System.out.println();
			}
		System.out.print(s.charAt(i));		
		}
		

	}

}
