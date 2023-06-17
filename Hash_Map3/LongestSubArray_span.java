// Java program to find largest subarray 
// with equal number of 0's and 1's. 
package Hash_Map3;
import java.util.*;
public class LongestSubArray_span {
//	Longest common span with same sum in binary array
	public static void main(String[] args) {
		int[] arr1 = {0, 1, 0, 1, 1, 1, 1}; 
		int[] arr2 = {1, 1, 1, 1, 1, 0, 1}; 
		
		System.out.println(longestCommonSum(arr1, arr2)); 
	}
	public static int longestCommonSum(int[]arr1,int[]arr2) {
		int[] arr=new int[arr1.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr1[i]-arr2[i];
		}
		HashMap<Integer,Integer> mp=new HashMap<>();
		int sum=0;int maxLen=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
			if(sum==0) maxLen=i+1;
			
			if(!mp.containsKey(sum)) mp.put(sum,i);
			
			if(mp.containsKey(sum-0)) {
				maxLen=Math.max(maxLen, i-mp.get(sum-0));
			}
		}
		return maxLen;
	}

}
