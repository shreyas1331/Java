package Stack1;

import java.util.ArrayDeque;

public class Java_Collection {

	public static void main(String[] args) {
		ArrayDeque<Integer> s=new ArrayDeque<>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());//30
		System.out.println(s.pop());//30
		System.out.println(s.peek());//20
		System.out.println(s.size());//2
		System.out.println(s.isEmpty());//false
		
	}

}
