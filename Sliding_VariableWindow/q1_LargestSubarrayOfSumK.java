package Sliding_VariableWindow;

public class q1_LargestSubarrayOfSumK {
    public static void main(String[] args) {
        int[]arr= {4,1,1,1,2,3,5};
		int k=5;
		f(arr,arr.length,k);
    }
    public static void f(int[]arr,int n,int k){
        int i=0,j=0;
        int maxi=0; int sum=0;
        while(j<n){
            sum=sum+arr[j];
            if(sum<k)j++;
            else if(sum==k){
                maxi=Math.max(maxi,j-i+1);
                j++;
            }
            else if(sum>k){
                while(sum>k){
                    sum=sum-arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(maxi);
    }
}
