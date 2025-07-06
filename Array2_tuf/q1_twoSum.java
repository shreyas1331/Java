package Array2_tuf;
import java.util.*;
public class q1_twoSum {

	public static void main(String[] args) {
		int[]arr = {2,7,11,15};
		int target = 9;
		int[]ans=twoSum(arr,target);
		System.out.println("Indices: " + ans[0] + ", " + ans[1]);
	}
	public static int[] two_sum(int[]arr,int target) {
		int[] result=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					result[0]=i;
					result[1]=j;
					return result;
				}
			}
		}
		return result;
	}
	public static int[] twoSum(int[]arr,int k) {
		int[] ans=new int[2];
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(k-arr[i])) {
				ans[0]=hm.get(k-arr[i]);
				ans[1]=i;
				return ans;
			}
			hm.put(arr[i], i);
		}
		return ans;
	}

}
