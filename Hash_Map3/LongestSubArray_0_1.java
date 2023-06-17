package Hash_Map3;
import java.util.HashMap;
public class LongestSubArray_0_1 {
//phele -1 krdiya aggr khi 0 hai and sum vala krke 
	public static void main(String[] args) {
		int[] arr= {1,1,1,0,0,0};
		System.out.println(longSubArray(arr));
		
	}
	public static int longSubArray(int[] arr) {
		HashMap<Integer,Integer> mp=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) arr[i]=-1;
			else arr[i]=1;
		}
		int sum=0,maxLen=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
			if(sum==0) maxLen=i+1;
			
			if(!mp.containsKey(sum)) mp.put(sum, i);
			
			if(mp.containsKey(sum-0)) {
				maxLen=Math.max(maxLen, i-mp.get(sum-0));
			}
		}
		return maxLen;
	}

}
