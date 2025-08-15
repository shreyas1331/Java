package Sliding_FixedWindow;

public class q1_maxSubarray {
        public static void main(String[]args){
        int[]arr={2,3,6,1,5};
        int k=3;
        solve(arr,arr.length,k);
    }
    public static void solve(int[]arr,int n,int k){
        int i=0,j=0; int sum=0; int max=0;
        while(j<n){
            sum=sum+arr[j];
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                max=Math.max(sum,max);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}
