package lecture4;

public class hardpattern3 {

	public static void main(String[] args) {
		//12344321
		//123**321
		//12****21
		//1******1
		int n=4;
		for(int i=0;i<n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(j); 
				
			}
			for(int sp=1;sp<=2*i;sp++) {
			System.out.print("*");
			}
			for(int k=n-i;k>=1;k--) {
				System.out.print(k);  
			}
		System.out.println();
		}
	}

}
