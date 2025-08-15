package Sliding_FixedWindow;
//question number 53 of leetcode
public class q2_maxSubarrayLeetcode {
        public static void main(String[]args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        
        int sum=0;int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxi=Math.max(maxi,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxi);
    }
}
// How Kadane’s Algorithm works in simple words
// Walk through the array, keeping track of a running sum.

// If the running sum ever becomes negative, start over from the next element.

// Always store the best sum found so far.