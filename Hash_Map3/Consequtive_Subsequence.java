package Hash_Map3;
import java.util.*;
public class Consequtive_Subsequence {

	public static void main(String[] args) {
		int arr[] = new int[]{1, 9, 3, 4, 2, 10, 13};
        int n = arr.length;
        System.out.println(findLongest(arr, n ));
	}
	public static int findLongest(int[] arr,int n) {
		int res=1;
		
		HashSet<Integer> hs=new HashSet<>();
		for(int x:arr) {
			hs.add(x);
		}
		
		for(int x:hs) {
			if(!hs.contains(x-1)) 
			{
				int cur=1;
				
				while(hs.contains(x+cur)) {
					cur++;
					res=Math.max(res, cur);
				}
			}
		}
		return res;
		
	}

}
//1.Create an empty hash.
//2.Insert all array elements to hash.
//3.Do following for every element arr[i]
//4.Check if this element is the starting point of a subsequence. 
//To check this, simply look for arr[i] - 1 in the hash, if not found, then this is the first element a subsequence.
//5.If this element is the first element, then count the number of elements in the consecutive starting with this element.
//Iterate from arr[i] + 1 till the last element that can be found.
//6.If the count is more than the previous longest subsequence found, then update this.
