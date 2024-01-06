package Stack2;
import java.util.*;
public class Next_Greater {
//o/p=30 -1 15 15 -1
//	public static void printNextGreater(int []arr,int n) {
//		Stack<Integer> s=new Stack<>();
//		s.add(arr[n-1]);//15
//		System.out.print(-1+" ");
//		for(int i=n-2;i>=0;i--) {
//			
//			while(s.isEmpty()==false && s.peek()<=arr[i])
//				s.pop();
//			
//			int pg=s.isEmpty()?-1:s.peek();
//			System.out.print(pg+" ");
//			s.add(arr[i]);
//		}
//		
//	}
//	public static void main(String[] args) {
//		int[] arr=new int[]{20,30,10,30,8};
//        
//        printNextGreater(arr,arr.length);
//      }
	
	public static ArrayList<Integer> nextGreater(int arr[],int n){
        ArrayList<Integer> v=new ArrayList<>();
        Stack <Integer> s=new Stack<>();
        s.add(arr[n-1]);v.add(-1);
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i])
                s.pop();
            int ng=s.isEmpty()?-1:s.peek();
            v.add(ng);
            s.add(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }
	public static void main (String[] args) {
	
	    int[] arr=new int[]{20,30,10,30,8};
        
        for(int x: nextGreater(arr,arr.length)){
            System.out.print(x + " ");   
        }  
	  
	}
	


}
