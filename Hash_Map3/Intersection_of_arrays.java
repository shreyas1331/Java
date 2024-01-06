 package Hash_Map3;
import java.util.*;
public class Intersection_of_arrays {

	public static void main(String[] args) {
		int[] a= {4,9,5};
		int[] b= {9,4,9,8,4};
		//b ko daldo hashset mai aur fir compare krdo a ke sath if it contains 
		//then print a
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<b.length;i++) {
			h.add(b[i]);
		}
		for(int j=0;j<a.length;j++) {
			if(h.contains(a[j])) {
				System.out.print(a[j]+" ");
			}
		}
	}

}
