package Strings2;
import java.util.Scanner;
public class whitespace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println("Method 1 (Your approach):");            // Method 1: Your original approach (inefficient)
		method1(input);
		
		System.out.println("Method 2 (StringBuilder):");           // Method 2: Using StringBuilder properly (efficient)
		method2(input);
		
		System.out.println("Method 3 (Built-in):");                // Method 3: Using built-in methods (most efficient)
		method3(input);
		
		System.out.println("Method 4 (All whitespace):");			// Method 4: Remove all whitespace characters (spaces, tabs, newlines)
		method4(input);
		
		sc.close();
	}
	// Your original approach - works but inefficient
	public static void method1(String input) {
		String ans="";
		StringBuilder str=new StringBuilder(input);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			else {
				ans=ans +str.charAt(i); // ❌ String concatenation in loop - O(n²)
			}
		}
		System.out.println(ans);
	}
	
	// Using StringBuilder properly - efficient
	public static void method2(String input) {
		StringBuilder result = new StringBuilder();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) != ' ') {
				result.append(input.charAt(i)); // ✅ Efficient - O(n)
			}
		}
		System.out.println(result.toString());
	}
	
	// Using built-in replace method - most efficient
	public static void method3(String input) {
		String result = input.replace(" ", ""); // ✅ Built-in method
		System.out.println(result);
	}
	
	// Remove all types of whitespace (spaces, tabs, newlines)
	public static void method4(String input) {
		String result = input.replaceAll("\\s+", ""); // ✅ Regex to remove all whitespace
		System.out.println(result);
	}
}
