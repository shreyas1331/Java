package Stackkk;

public class Stack_linkedlist {
	static class Node    //Added static
	{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}//END OF NODE
	
	static class MyStack    //Added static 
	{
		Node head;
		int sz;
		
		MyStack(){
			head=null;
			sz=0;
		}
		int size() {
			return sz;
		}
		boolean isEmpty() {
			return (head==null);
		}
		void push(int x) {
			Node temp=new Node(x);
			temp.next=head;
			head=temp;
			head=temp;
			sz++;
		}
		int pop() {
			if(head==null)
				return Integer.MAX_VALUE;
			int res=head.data;
			head=head.next;
			sz--;
			return res;
		}
		int peek() {
			if(head==null)         //UNDERFLOW
				return Integer.MAX_VALUE;
			return head.data;
		}
	}//END OF STACK
	public static void main(String[] args) {
		MyStack st=new MyStack();
//		System.out.println(st.isFull());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		
	}

}
