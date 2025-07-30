package Linked_List2;

public class nth_node {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static Node nth_node(Node head, int n) {
		Node slow=head;
		Node fast=head;
		for(int i=1;i<=n;i++) {
			fast=fast.next;
		}
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
	public static Node deleteNthFromEnd(Node head,int n) {
		Node slow=head;
		Node fast=head;
		for(int i=1;i<=n;i++) {
			fast=fast.next;
		}
		if(fast==null) {
			head=head.next;
			return head;
		}
		while(fast.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		slow.next=slow.next.next;
		return head;
	}
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public static void main(String[] args) {
		Node a=new Node(100);
		Node b=new Node(13);
		Node c=new Node(4);
		Node d=new Node(6);
		Node e=new Node(10);
		Node f=new Node(19);//100->13->4->6->10->19
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		Node q=nth_node(a, 3);
		System.out.println(q.data);
//		display(a);
		a=deleteNthFromEnd(a, 6);
		display(a);
	}

}
