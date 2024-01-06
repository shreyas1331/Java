package Hash_Map3;
import java.util.*;
public class Subarray_givenSum {

	public static void main(String[] args) {
		 int[] arr= {1,1,1};
		 int sum=2;
		 System.out.println(GivenSum(arr,sum));
	}
	public static int GivenSum(int[] arr,int sum) {
		Set<Integer> h=new HashSet<>();
		int prefix=0;
		for(int x:arr) {
			prefix+=x;
			if(prefix==sum)
				return 1;
			if(h.contains(prefix-sum))
				return 1;
			h.add(prefix);
		}
		return 0;
	}

}
