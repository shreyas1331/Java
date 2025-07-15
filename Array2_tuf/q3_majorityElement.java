package Array2_tuf;
import java.util.*;
public class q3_majorityElement {

	public static void main(String[] args) {
		int[] arr= {2,3,3,1,1,1,1};
		majority(arr,arr.length);
		majority2(arr,arr.length);
	}
	public static void majority(int[]arr,int n) {
		int res=0;int maj=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		//t.c-O(n)  s.c-O(n)
		for(int i=0;i<n;i++) {
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
			if(map.get(arr[i])>maj){
                res=arr[i];
                maj=map.get(arr[i]);
            }
		}
		for(Map.Entry<Integer, Integer>e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println(res);
	}
	public static void majority2(int[]arr,int n) {//moore voting algo
		int cnt=0;
		int ele=0;
		for(int i=0;i<arr.length;i++) {
			if(cnt==0) {
				cnt=1;
				ele=arr[i];
			}else if(arr[i]==ele) cnt++;
			else cnt--;
		}
		System.out.println(ele);
		// Phase 2: Verify if the candidate is actually majority
		// (This step is important for arrays that might not have a majority element)
		cnt = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) cnt++;
		}
		
		if(cnt > n/2) {
			System.out.println("Majority element: " + ele);
		} else {
			System.out.println("No majority element found");
		}
	}

}
