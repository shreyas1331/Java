package Array2_tuf;
import java.util.*;
public class q2_sortColors {
	public static void swap(int[]arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    public static void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(Arrays.toString(arr));
		sortColors(arr);
	}

}
