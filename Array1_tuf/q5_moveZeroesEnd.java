package Array1_tuf;

public class q5_moveZeroesEnd {

	public static void main(String[] args) {
		int[] arr= {4,1,0,3,12};
		int n=arr.length;
		move(arr,n);
	}
	public static void move(int[]arr,int n) {
		int i=0;
		for(int j=0;j<n;j++) {
			if(arr[j]!=0) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
			}
		}
		for(int k=0;k<n;k++) {
			System.out.println(arr[k]+" ");
		}
	}

}
