package Array1_tuf;

public class q8_maxConsecutiveOnes {

	public static void main(String[] args) {
		int[]nums = {1,1,0,1,1,1};
		int ans=findMaxConsecutiveOnes(nums);
		System.out.println(ans);
	}
	public static int findMaxConsecutiveOnes(int[]nums) {
		int cnt=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }else if(nums[i]==0){
                cnt=0;
            }
            maxi=Math.max(maxi,cnt);
        }
        return maxi;
	}
	

}
