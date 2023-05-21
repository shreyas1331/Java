package Linked_List2;

public class bnao_ll {
	
	public static void displayR(Node head) {
		if(head==null)return ;
		displayR(head.next);
		System.out.print(head.data+" ");
		
	}
	public static void display(Node head){
		Node temp=head;
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static int length(Node head) {
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	public static void main(String[] args) {
		Node a=new Node(10);
		Node b=new Node(30);
		Node c=new Node(60);
		Node d=new Node(20);
		Node e=new Node(40);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		display(a);
		System.out.println();
		displayR(a);
		System.out.println();
		System.out.println(length(a));
	}

}
