package Linked_List2;

public class practice {
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

    public static void displayR(Node head) {
        if (head == null)
            return;
        displayR(head.next);
        System.out.print(head.data + "->");
    }

    public static void length(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(15);
        Node c = new Node(20);
        Node d = new Node(30);
        a.next = b; // a -> b -> c -> d
        b.next = c;
        c.next = d;
        display(a);
        System.out.println();
        displayR(a);
        System.out.println();
        length(a);
    }
}
