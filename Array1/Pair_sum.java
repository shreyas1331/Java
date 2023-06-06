package Array1;

import java.util.Scanner;

public class Pair_sum {

	static int tripletSum(int[] arr,int target) {
		int n=arr.length;
		int ans=0;
		for(int i=0;i<n;i++) {//first number
			for(int j=i+1;j<n;j++) {//second number
				for(int k=j+1;k<n;k++) {//third number
				if(arr[i]+arr[j]+arr[k]==target) {
					ans++;
				}
			}
			}
		}
		return ans;  
	}
	
//	static int pairSum(int[] arr,int target) {
//		int n=arr.length;
//		int ans=0;
//		for(int i=0;i<n;i++) {//first number
//			for(int j=i+1;j<n;j++) {//second number
//				if(arr[i]+arr[j]==target) {
//					ans++;
//				}
//			}
//		}
//		return ans;  
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter"+n+"elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter target sum");
		int target=sc.nextInt();
//		System.out.println("pair sum is:"+pairSum(arr,target));
		System.out.println("triplet sum is:"+tripletSum(arr,target));

	}

}
