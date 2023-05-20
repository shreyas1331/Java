package Linked_List2;

public class Insert_Begin {
	public class Node{
		int data;
		Node next;
		public Node(int x){
			this.data=x;
			next=null;
		}	
	}
	class Test{
		 static Node insertBegin(Node head,int x) {
			Node temp=new Node(x);
			temp.next=head;
			return temp;
		}
		public static void main(String[] args) {
			Node head=null;
			head=insertBegin(head, 30);
			head=insertBegin(head, 20);
			head=insertBegin(head, 10);
		}
	}

}


