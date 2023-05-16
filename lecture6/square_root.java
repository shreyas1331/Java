package lecture6;

public class square_root {

	public static void main(String[] args) {
		int n=56;
		int start=1;
		int end=n;
		int ans=0;
		while(start<=end){
			int mid=(start+end)/2;
			if(mid*mid<=n) {
				ans=mid;
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		System.out.println(ans);
	}

}
