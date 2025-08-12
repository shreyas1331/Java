package Linked_List4;

public class q5_mergeTwoLL {
//     class Solution {//  O(n) space
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode temp1=list1;
//         ListNode temp2=list2;
//         ListNode head=new ListNode(100);
//         ListNode temp=head;
//         while(temp1!=null && temp2!=null){
//             if(temp1.val<temp2.val){
//                 ListNode a=new ListNode(temp1.val);
//                 temp.next=a;
//                 temp=a;
//                 temp1=temp1.next;
//             }else {
//                 ListNode a=new ListNode(temp2.val);
//                 temp.next=a;
//                 temp=a;
//                 temp2=temp2.next;
//             }
//         }
//             if(temp1==null){
//                 temp.next=temp2;
//             }else{
//                 temp.next=temp1;
//             }
//         return head.next;
//     }
// }
}
//O(1) space
// public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         // Create a dummy node to simplify logic
//         ListNode head = new ListNode(0);
//         ListNode temp = head;
        
//         // Compare nodes and link them directly (no new nodes created)
//         while (list1 != null && list2 != null) {
//             if (list1.val <= list2.val) {
//                 temp.next = list1;  // Link existing node
//                 list1 = list1.next;    // Move to next
//             } else {
//                 temp.next = list2;  // Link existing node
//                 list2 = list2.next;    // Move to next
//             }
//             temp = temp.next;    // Move current pointer
//         }
        
//         // Attach remaining nodes (if any)
//         if (list1 != null) {
//             temp.next = list1;
//         } else {
//             temp.next = list2;
//         }
        
//         return head.next; // Skip dummy node
//     }
