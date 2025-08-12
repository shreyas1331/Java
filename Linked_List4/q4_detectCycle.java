package Linked_List4;

public class q4_detectCycle {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static boolean hasCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("=== Test Case 1: Without Cycle ===");
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(8);
        Node e = new Node(20);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next=e;

        System.out.println("Has cycle: " + hasCycle(a));

        System.out.println("=== Test Case 2: With Cycle ===");
        Node x = new Node(10);
        Node y = new Node(20);
        Node z = new Node(30);
        Node w = new Node(40);
        x.next = y;
        y.next = z;
        z.next = w;
        w.next = y; // Creates cycle: y -> z -> w -> y
        
        System.out.println("Has cycle: " + hasCycle(x));
    }
}
