package Array1_tuf;

public class q9_singleNumber {

	public static void main(String[] args) {
		int[]arr= {1,2,1,3,4,4,3};
		int ans=findsingle(arr);
		System.out.println(ans);
	}
	public static int findsingle(int[]arr) {
		int xor=arr[0];
        for(int i=1;i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
	}

}
