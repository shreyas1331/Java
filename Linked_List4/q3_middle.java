package Linked_List4;

public class q3_middle {
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
    public static void middle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next!=null) { //for odd and for even condition is fast.next.next!=null
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }
    public static Node deleteMiddle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast.next.next!=null && fast.next.next.next!=null){ //ek phele slow pe rok do
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(8);
        Node e = new Node(20);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next=e;
        middle(a);
        Node q=deleteMiddle(a);
        display(q);
    }
}