package Array1_tuf;

public class q1_largest_number {

	public static void main(String[] args) {
		int[]arr= {1,1,1,1,1,1,2};
		large(arr,arr.length);
		int max=large(arr,arr.length);
		secondLarge(arr,arr.length,max);
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
	public static void secondLarge(int[]arr,int n,int largest) {
		int secondLargest=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		System.out.println(secondLargest);
	}

}
