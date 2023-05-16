package Strings;

public class Non_repeated {
//	. Write a Java program to find the first non-repeated character in a string.
	public static void main(String[] args) {
		String str1 = "gibblegabbler";
		  System.out.println("The given string is: " + str1);
		  for (int i = 0; i < str1.length(); i++) {
		   boolean flag = true;
		   for (int j = 0; j < str1.length(); j++) {
		    if (i != j && str1.charAt(i) == str1.charAt(j)) {
		     flag = false;
		     break;
		    }
		   }
		   if (flag) {
		    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
		    break;
		   }
	}

}
}
