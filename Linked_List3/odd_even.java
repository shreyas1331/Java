package Linked_List3;
import java.util.*;
public class odd_even {

	public static void main(String[] args) {
//		class Solution {
//		    public ListNode oddEvenList(ListNode head) {
//		        if(head == null || head.next == null){
//		            return head;
//		        }
//		        ListNode odd = head , even = head.next , evenHead = even;
//		        while(even!=null && even.next!=null){
//		            odd.next = even.next;
//		            odd = odd.next;
//		            even.next = odd.next;
//		            even = even.next;
//		        }
//		        odd.next = evenHead;
//		        return head;
//		    }
//		}
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();//5
				LinkedList<Integer> list=new LinkedList<Integer>();//linked list bnai
				for(int i=0;i<n;i++){//inputing in ll
					int n1=sc.nextInt();
					list.add(n1);
				}
				LinkedList<Integer> l2=new LinkedList<Integer>();//2nd ll
				for(int i=0;i<n;i++){
					int n2=list.get(i);
					if(n2 %2 !=0){//for odd
						l2.add(n2);
					}

				}
				System.out.println(l2);
				System.out.print("---l2 list---");
				for(int i=0;i<n;i++){
					int n3=list.get(i);
					if(n3 %2==0){
						l2.add(n3);
					}
				}
				System.out.println(l2);
				for(int i=0;i<n;i++){
					System.out.print(l2.get(i)+" ");
				}
				
				}
		
	}


