package Array2;
import java.util.*;
public class NextGreaterElement {
//problem is time complexity O(n^2)[Array]
	//if we want to be it in O(n)[by STACK]
	public static void main(String[] args) {
		int[] arr= {20,30,10,5,15};
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					res[i]=arr[j];
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j=0;j<res.length;j++) {
			System.out.print(res[j]+" ");
		}
	}

}
