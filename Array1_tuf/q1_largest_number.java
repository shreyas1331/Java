package Array1_tuf;

public class q1_largest_number {

	public static void main(String[] args) {
		int[]arr= {1,1,1,1,9,7,2};
		large(arr,arr.length);
		int max=large(arr,arr.length);
		secondLarge(arr,arr.length,max);
		secondLargeOptimal(arr,arr.length);
	}
	public static int large(int[]arr,int n) {
		int largest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	public static void secondLarge(int[]arr,int n,int largest) {  //this is better approach
		//t.c-> O(2N)
		int secondLargest=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		System.out.println(secondLargest);
	}
	public static void secondLargeOptimal(int[]arr,int n) {
		int largest=arr[0], secondLargest=-1;
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		System.out.println(secondLargest);
	}

}
