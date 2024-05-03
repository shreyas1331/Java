package TwoD_array;

public class WaveColWise {

	public static void main(String[] args) {
		int[]arr= {3,5,2,4,6};
		int n=arr.length;
		solve(arr,n);
	}
	public static void solve(int[]arr,int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			int fre=(i+1)*(n-i);
			if(fre%2==1) {
				res=res^arr[i];
			}
		}
		System.out.println(res);
	}

}
