package array;

import java.util.*;

public class Is_Sorted {
	
	public static int[] smallestandlargest(int[] arr) {
		Arrays.sort(arr);
		int[] ans= {arr[0],arr[arr.length-1]};
		return ans ;
	}
	public static boolean Sorted(int[]arr) {
		boolean check=true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				check=false;
			}
		}
		return check;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("is sorted:"+Sorted(arr));
		int[] ans=smallestandlargest(arr);
		System.out.println("smallest is:"+ans[0]);
		System.out.println("largest is:"+ans[1]);


	}

}
