package Linked_List1;

public class Linkedlist {

	public class Node {
		int data;
		Node next;

		public Node() {

		}

		public Node(int val) {
			this.data = val;
		}
	}

	Node head;
	int size;
	Node tail;

	public void addFirst(int val) {
		Node nn = new Node(val);

		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void addLast(int val) {
		if (size == 0) {
			addFirst(val);
		} else {
			Node nn = new Node(val);
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public Node getNode(int k) {
		Node temp = head;
		for (int i = 1; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAtPosition(int val, int k) {
		if (size == 0) {
			addFirst(val);
		} else {
			Node temp1 = getNode(k - 1);
			Node temp2 = getNode(k);

			Node nn = new Node(val);

			temp1.next = nn;
			nn.next = temp2;
			size++;
		}
	}

	public void deleteFirst() {
		Node temp = head;
		head = head.next;
		temp.next = null;
		size--;
	}

	public void deleteLast() {

		Node temp = getNode(size - 1);
		temp.next = null;
		tail = temp;
		size--;

	}

	public void deleteAtPosition(int k) {
		if (k == 1) {
			deleteFirst();
		} else {
			Node temp1 = getNode(k - 1);
			Node temp2 = temp1.next;
			temp1.next = temp2.next;
			temp2.next = null;
			size--;
		}
	}

	public int getFirst() {
		return head.data;
	}

	public int getLast() {
		return tail.data;
	}

	public int getAtPosition(int k) {
		if (k == 1) {
			return head.data;
		}
		if (k == size) {
			return tail.data;
		}
		return getNode(k).data;
	}

	public int size() {
		return size;
	}
	
	public void reverse() {
		Node prev = null;
		Node curr = head;
		Node next = head;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

}