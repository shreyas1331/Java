package Linked_List4;

public class q2_intersection {
    public static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static Node intersection(Node headA, Node headB) {
        if (headA == null || headB == null)
            return null;

        // Get the lengths of both lists
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        // Align the start of both lists
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Traverse both lists together to find the intersection point
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA; // or headB, both are the same at this point
    }
    public static Node intersection2(Node headA, Node headB) {
    Node a = headA;  // Pointer for list A
    Node b = headB;  // Pointer for list B
    
    while(a != b) {      // Continue until pointers meet
        if(a == null) {
            a = headB;   // Restart from head of B
        } else {
            a = a.next;  // Move to next node
        }
        
        if(b == null) {
            b = headA;   // Restart from head of A
        } else {
            b = b.next;  // Move to next node
        }
    }
    
    return a;  // Either intersection node or null
}

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
        Node aa = new Node(15);
        Node bb = new Node(35);
        Node cc = new Node(10);
        Node dd = new Node(55);
        Node ee = new Node(45);
        aa.next = bb;
        bb.next = cc;
        cc.next = dd;
        dd.next = ee;
        display(a);
        System.out.println();
        Node q=intersection(a, aa);
        System.out.println(q);
        Node p=intersection2(a,aa);
    }
}
