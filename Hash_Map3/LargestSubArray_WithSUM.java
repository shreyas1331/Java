package Hash_Map3;
import java.util.*;
public class LargestSubArray_WithSUM {

	public static void main(String[] args) {
		int[] arr= {5,2,3};
		int Givensum=5;
		System.out.println(maxLen(arr, Givensum));
	}
	public static int maxLen(int[] arr,int Givensum) {
		// HashMap to store (sum, index) tuples
		HashMap<Integer,Integer> mp=new HashMap<>();
		int sum=0;
		int maxLen=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];					// accumulate sum
			
			if(sum==Givensum) maxLen=i+1;			// when subarray starts from index '0'
			
			if(!mp.containsKey(sum)) mp.put(sum, i); //add to map if noot present
			
//			check if 'sum-k' is present in 'map' or not 
			if(mp.containsKey(sum-Givensum)) {       //10-5=5(it contains 5)
				maxLen=Math.max(maxLen, i-mp.get(sum-Givensum));// update maxLength
			}
		}
		return maxLen;
	}

}
