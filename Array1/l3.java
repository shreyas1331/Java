package Array1;

import java.util.Scanner;
//OCCURRENCE
public class l3 {

	static int lastIndex(int[] arr,int x) {
		int lastIndex=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				lastIndex=i;
			}
		}
		return lastIndex;
	}
	static int occurrence(int[] arr,int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int[]arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("enter x:");
			int x=sc.nextInt();
			
			System.out.println("count of x:"+occurrence(arr,x));
			System.out.println("lastIndex of x:"+lastIndex(arr,x));

		}

	}

}
