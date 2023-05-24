package Arrays2;

public class NextGreaterElement {
//problem is time complexity O(n^2)[Array]
	//if we want to be it in O(n)[by STACK]
	public static void main(String[] args) {
		int[] arr= {1,3,2,1,8,6,3,4};
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					res[i]=arr[j];
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j=0;j<res.length;j++) {
			System.out.print(res[j]+" ");
		}
	}

}
