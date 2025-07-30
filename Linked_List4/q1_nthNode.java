package Linked_List4;

public class q1_nthNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void displayNthnode(Node head, int n) {// nth node from last
        Node fast = head;
        Node slow = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(30);
        Node c = new Node(10);
        Node d = new Node(50);
        Node e = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a); System.out.println();
        displayNthnode(a, 2);
    }
}