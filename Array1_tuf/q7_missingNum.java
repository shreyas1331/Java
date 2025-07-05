package Array1_tuf;

public class q7_missingNum {

	public static void main(String[] args) {
		int[]arr= {3,0,1};
		int ans=miss(arr);
		System.out.println(ans);
	}
	public static int miss(int[]arr) {
		int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);//4
        int sum2=0;
        for(int i=1;i<=arr.length;i++){
            sum2=sum2+i;
        }
        return sum2-sum;
	}

}
