package Queue;
import java.util.*;
public class Reversing {
	static Queue<Integer> queue; 
	
	static void reversequeue() 
	{ 
		Stack<Integer> stack = new Stack<>(); 
		while (!queue.isEmpty()) 
		{
			stack.add(queue.remove()); 
		} 
		while (!stack.isEmpty()) 
		{ 
			queue.add(stack.pop()); 
		} 
	}
	public static void main(String[] args) {
		queue = new LinkedList<Integer>(); 
		queue.add(12); 
		queue.add(5); 
		queue.add(15); 
		queue.add(20); 
		
		Print();
		System.out.println();
		reversequeue(); 
		Print();
	}
	static void Print()
	{ 
		for(Integer x: queue)
		    System.out.print(x + " ");
	} 

}
