package Array1_tuf;
import java.util.*;
public class q3_removeDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,3,3,3};//required answer is {1,2,3}
		remove1(arr,arr.length);
		remove2(arr,arr.length);
	}
	public static void remove1(int[] arr,int n) {
		HashSet<Integer> set=new HashSet<>();// brute  O(n*log(n))+O(n)
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set.size());	
	}
	public static void remove2(int[]arr,int n) {//optimal
		int i=0;
		for(int j=1;j<n;j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		System.out.println(i+1);
	}

}
