package Strings1;

public class StringDemo {
//1.CONCAT				4.EQUALS
//2.LENGTH				5.COMPARETO
//3.CHARAT				6.CONTAINS
//7.INDEXOF				8.
	public static void main(String[] args) {
//		String s = "Abc";
//		System.out.println(s);
//
//		String s1="Abc";
		//CONCAT
//		s=s.concat("abc");
//		System.out.println(s);

//		String s2 = new String("abc");
//		System.out.println(s2);
//		s2.concat("agdhd");
//		System.out.println(s2);
//
		String s1 = "abcabc";  
		String s2 = "abc";
		String s3 = new String("ABC");

//		arr.length , s.length();

		System.out.println(s1.length());     //6
		System.out.println(s1.charAt(2));    //c
		
		

//		 == Address
		System.out.println(s1 == s2);        //false
		System.out.println(s1 == s3);   //sees address     //false
		
		
		
		
		// Content
		System.out.println(s1.equals(s3));   //false(sees content)
		
		
		// Ascii diff
		System.out.println(s1.compareTo(s3));//

		System.out.println(s2.compareToIgnoreCase(s3));
		System.out.println(s2.contains("ab"));

		s2 = "abc";
		//LOWERCASE   UPPERCASE   
		System.out.println(s2.indexOf('b'));  //1
		System.out.println(s2.toUpperCase()); //ABC
		System.out.println(s2.toLowerCase()); //abc
		
//		String s="abc";
//		String s1=s+"abc";
//		String s2="abcabc";
//		System.out.println(s1==s2);
		
		//CONTAINS STARTWITH ENDWITH
		String s4="shreyas";
		System.out.println(s4.contains("yas"));             //true
		System.out.println(s4.startsWith("s"));             //true

	}

}