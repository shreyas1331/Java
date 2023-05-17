package assi_ques;

public class q1_Prime {

	public static void main(String[] args) {
		int n=15;
		prime(n);
		int a = 34;//divident
		int b = 60;//divisor
		while(a%b!=0) {
			int rem=a%b;
			a=b;
			b=rem;
		}
		System.out.println(b);
	}


	private static void prime(int n) {
		// TODO Auto-generated method stub
		for (int i=2;i<n;i++) {
			if (n%i==0) {
			System.out.println("its not prime");
			break;}
			
			else 
			{
				System.out.println("its Prime");
			
			}
		}}}

		
	


