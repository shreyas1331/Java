package Linked_List1;

public class LinkedList_client {
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
//		ll.addFirst(10);
//		ll.addFirst(20);
//		ll.addFirst(30);
//		ll.addFirst(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.addLast(70);
//		ll.display();
 		ll.addAtPosition(80, 4);
		ll.display();
//		ll.deleteLast();
		ll.deleteAtPosition(1);
		System.out.println();
		ll.display();
		System.out.println();
	}

}