package Stack2;
import java.util.*;
public class Next_Greater {
//o/p=30 -1 15 15 -1
	public static void printNextGreater(int []arr,int n) {
		Stack<Integer> s=new Stack<>();
		s.add(arr[n-1]);
		System.out.print(-1+" ");
		for(int i=n-2;i>0;i--) {
			while(s.isEmpty()==false && s.peek()<=arr[i])
				s.pop();
			int pg=s.isEmpty()?-1:s.peek();
			System.out.print(pg+" ");
			s.add(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		int[] arr=new int[]{20,30,10,5,15};
        
        printNextGreater(arr,arr.length);
      }
	


}
