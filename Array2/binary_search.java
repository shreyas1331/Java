package Array2;

public class binary_search {
	//leetcode 278
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7};
		int item=2;
		
		int start=0;
		int end=nums.length-1;
		int idx=-1;
		while(start<end) {
			int mid=(start+end)/2;
			if(item==nums[mid]) {
				idx=mid;
				break;
			}
			else if(item<nums[mid]) {
				end=mid-1;
			}
			}
		}
	}


