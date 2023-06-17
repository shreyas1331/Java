package Array3;

public class LongestSubarray_0_1 {

	public static void main(String[] args) {
		int[] arr= {1,1,0,1,1,1,1,1,0};
		int n=arr.length;
		System.out.println(longestSub(arr,n));
	}
	public static int longestSub(int[]arr,int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			
			int c0=0,c1=0;
			
			for(int j=i;j<n;j++)
			{
				if(arr[j]==0) c0++;
				
				else if (arr[j]==1) c1++;
				
				if(c0==c1) res=Math.max(res,c0+c1);
			}
		}
		return res;
	}

}
