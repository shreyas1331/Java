package Hash_Map3;
import java.util.*;
public class Union_unsortedArrays {

	public static void main(String[] args) {
		int[] a= {15,20,5,15};
		int[] b= {15,15,20,10};
		HashSet<Integer> h=new HashSet<>();
		for(int i:a) {
			h.add(i);
		}
		for(int j:b) {
			h.add(j);
		}
		System.out.println(h.size());
	}

}
