package Stack1;

import java.util.*;

public class BalancedParenthesis {

	static boolean isBalanced(String str) {
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x == '(' || x == '{' || x == '[')
				s.push(x);
			else {
				if (s.empty())
					return false;
				else if (x == ')' && s.peek() != '(') {
					return false;
				} else if (x == ']' && s.peek() != '[') {
					return false;
				} else if (x == '}' && s.peek() != '{') {
					return false;
				} else
					s.pop();
			}
		}
		return (s.isEmpty() == true);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string with parentheses: ");

		// Check if there is any input available
		if (scanner.hasNextLine()) {
			String s1 = scanner.nextLine();
			if (isBalanced(s1)) {
				System.out.println("The parentheses in the string are balanced.");
			} else {
				System.out.println("The parentheses in the string are not balanced.");
			}
		}
	}

}