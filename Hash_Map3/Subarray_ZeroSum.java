package Hash_Map3;
import java.util.*;
public class Subarray_ZeroSum {
//1.prefix lelo phir add krdo usmai array ka number aur aggr
	//h contains toh true nhi toh false
	public static void main(String[] args) {
		int[] arr= {-3,2,1,4};
		System.out.println(subarray(arr));
	}
	public static int subarray(int[] arr) {
		Set<Integer> h=new HashSet<>();
		int prefix=0;
		h.add(0);
		for(int i=0;i<arr.length;i++) {
			prefix=prefix+arr[i];
			if(h.contains(prefix)==true) {
				return 1;
			}
			h.add(prefix);
		}
		return 0;
	}

}
