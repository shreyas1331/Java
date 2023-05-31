package array_list;

import java.util.*;
import java.util.ArrayList;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String input=sc.nextLine();
		ArrayList <String> char1=new ArrayList<String>();
		ArrayList <Character> char3=new ArrayList<Character>();
		for(int i=0;i<input.length();i++) {
			char3.add(input.charAt(i));
		}
		String c = sc.next();
		int element= char3.lastIndexOf(c);
		System.out.print(element);
		if(element != -1) {
			System.out.print("element is present " + c+"at "+ element );
				
		}
		else {
			System.out.print("fuck off");
		}
		System.out.println(char3);
		
	}

}