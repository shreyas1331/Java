package Array1;
import java.util.*;
public class stack_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.print(st);
		Stack<Integer> st1=new Stack<>();
		while(!st.isEmpty()) {
			int popedItems=st.pop();
			st1.push(popedItems);
		}
//		System.out.println(st);
		System.out.println(st1);
////		while(!st1.isEmpty()) {
////			st.push(pop2);
////			int pop2=st1.pop();
////			
////		}
//		System.out.println(st);
	}

}
