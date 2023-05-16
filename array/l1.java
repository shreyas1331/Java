package array;


public class l1 {
//MAX IN THE ARRAY
	public static void main(String[] args) {
		int arr[]= {1,2,4,6,3};
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>ans) {
				ans=arr[i];
			}
		}
		System.out.println("max is :"+ans	);
	}
		 
	}


