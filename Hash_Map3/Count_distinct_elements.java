package Hash_Map3;
import java.util.*;
public class Count_distinct_elements {
	//Count Number of Distinct Integers After Reverse Operations
	
	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<>();
		int[] arr= {1,5,4,2,9,9,9};//1 5 4 2 9
		
		for(int i=0;i<arr.length;i++) {
			h.add(arr[i]);
		}
		for(Integer s:h) {
        	System.out.print(s+" ");
        }
		System.out.println();
		System.out.println( h.size());
	}

}
