package Linked_List3;
import java.util.*;
public class Reverse__ll {

	
//		class Solution {
//		    public ListNode reverseList(ListNode head) {
//		        //1 2 3 4 5
//		        ListNode cur=head;
//		        ListNode pre=null;
//		        ListNode after=null;
//		        while(cur!=null)
//		        {
//		            after=cur.next;
//		            cur.next=pre;
//		            pre=cur;
//		            cur=after;
//		        }
//		        return pre;
//		    }
//		}
//--------------------------linkedlist k reverse-------------------------------
			static void reverse(Integer[] arr,int n,int m){
				for(int i =0;i<n;i+=m){
					int start = i;
					int end = Math.min(i+m-1,n-1);
					while(start<end){
						int temp = arr[start];
						arr[start] = arr[end];
						arr[end] = temp;
						start++;
						end--;}}}
		    public static void main (String args[]) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int m = sc.nextInt();
				LinkedList<Integer>list = new LinkedList<>();
				for(int i=0;i<n;i++)
				{
					list.add(sc.nextInt());
				}
				Integer[] arr = list.toArray(new Integer[list.size()]);
				reverse(arr,n,m);
				for(int i=0;i<n;i++)
				{
					System.out.print(arr[i]+" ");
					
				}
		    }
	}


