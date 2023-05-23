package Array1;

public class l2 {
	//SEARCH AN ELEMENT
	public static void main(String[] args) {
		int[] arr= {1,2,3,5};
		int target=7;
		boolean flag=false;
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				flag=true;
				ans=i;
			}
		}
		if(flag) {
			System.out.print(ans);
		}
		else {
			System.out.print("-1");
		}
	}

}
