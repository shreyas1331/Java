package Array1_tuf;

public class q2_isSorted {

	public static void main(String[] args) {
		int[]arr= {3,2,2,3,4};
		System.out.print(isSorted(arr,arr.length));
	}
	public static boolean isSorted(int[]arr,int n) {
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

}
