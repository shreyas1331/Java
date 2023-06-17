package Array3;

public class Two_Sum {

	public static void main(String[] args) {
		int[]arr = {2,7,11,15};
		int target = 9;
		System.out.print(two_sum(arr,target));
//		two_sum()
		
	}
	public static int[] two_sum(int[]arr,int target) {
		int[] result=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					result[0]=i;
					result[1]=j;
					return result;
				}
				
			}
			
		}
		return result;
	}
}