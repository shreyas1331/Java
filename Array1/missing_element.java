package Array1;
import java.util.*;
class missing_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum1=0;
		for(int i=0;i<n-1;i++) {
			arr[i]=sc.nextInt();
			sum1=sum1+arr[i];
		}
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		System.out.println(sum1);

		int sum2=sum-sum1;
		System.out.println(sum2);

	
		
	}
}
