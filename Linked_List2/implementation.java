package Linked_List2;

public class implementation {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static class linkedlist {
		Node head=null;
		Node tail=null;
		
		
		void insertAtEnd(int val){
			Node temp=new Node(val);
			if(head==null) {
				head=temp;
				tail=temp;
			}
			else {
				tail.next=temp;
				tail=temp;
			}
		}
		
		
		void insertAtBegin(int val) {
			Node temp=new Node(val);
			if(head==null) {
				head=temp;
				tail=temp;
			}else {
			temp.next=head;
			head=temp;
			}
		}
		
		void insertAt(int idx,int val) {
			Node t=new Node(val);
			Node temp=head;
			if(idx==0) {
				insertAtBegin(val);
				return;
			}
			for(int i=1;i<=idx-1;i++) {
				temp=temp.next;
			}
			t.next=temp.next;
			temp.next=t;
		}
		
		int getAt(int idx) {
			Node temp=head;
			for(int i=0;i<idx;i++)
			{
				temp=temp.next;
			}
			return temp.data;
		}
		
		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
		
		int size() {
			Node temp=head;
			int count=0;
			while(temp!=null) {
				count++;
				temp=temp.next;
			}
			return count;
		}
	}	
	
	public static void main(String[] args) {
		linkedlist ll=new linkedlist();
		ll.insertAtEnd(4);
		ll.insertAtEnd(5);
		ll.insertAtEnd(6);
		ll.display();
		System.out.println();
		System.out.println(ll.size());
		ll.insertAtBegin(7);
		ll.display();
		ll.insertAt(0, 1);
		System.out.println();
		ll.display();
		System.out.println();
		System.out.println(ll.getAt(3));
	}
	
}
