package Arrays2;

public class PrevGreaterElement {
	//arr={20,30,10,5,15}
	//	  {-1,-1,30,10,30}
	private static void printprevGreater(int[] arr, int n) {
		for(int i=0;i<n;i++) {//2->10
			int j;
			for(j=i-1;j>=0;j--) {//1->30
				if(arr[j]>arr[i]) {//30>20
					System.out.print(arr[j]+" ");
					break;
				}
			}
			if(j==-1) {
				System.out.print(-1+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= new int[]{20,30,10,5,15};
		printprevGreater(arr ,arr.length);
	}

	
}
