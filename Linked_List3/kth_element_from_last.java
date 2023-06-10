package Linked_List3;
import java.util.*;
public class kth_element_from_last {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> ll=new LinkedList<Integer>();
		int n=sc.nextInt();
		while(n!=-1) {
			ll.add(n);
			n=sc.nextInt();
		}
//		System.out.println(ll);
		int k=sc.nextInt();
		int r=1;
		for(int i=ll.size()-1;i>0;i--)
		{
			if(r==k) {
				System.out.print(ll.get(i));
			}
			r++;
		}
	}
}
