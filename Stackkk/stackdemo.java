package Stackkk;
public class stackdemo {

	int []arr=new int[5];
	int tos=-1;
	int size=0;
	public boolean isEmpty(){
		if(tos==-1) {
			return true;
	}
	return false;	
	}
 	public void push(int val) throws Exception {
 		if(isFull()) {
 			throw new Exception("Stack is full");
 		}
	tos++;
	arr[tos]=val;
	size++;	
 	}
 	public void pop() throws Exception {
 		if(isEmpty()) {
 			throw new Exception("Stack is empty");
 		}
 		tos--;
 		size--;
 	}
 	public int peek() throws Exception {
 		if(isEmpty()) {
 			throw new Exception("Stack is empty");
 		}
 		return arr[tos];
 	}
 	public boolean isFull() {
 		return tos==arr.length-1;
 	}
 	public void display() throws Exception {
 		if(isEmpty()) {
 			throw new Exception("Stack is empty");		
 		}
 		for(int i=tos;i>=0;i--) {
 			System.out.println(arr[i]);
 		}
 	}
 	
}