package TwoD_array;

import java.util.Scanner;
//ROTATE ANTICLOCKWISE
public class rotate_image {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int a[][]=new int[n][n];
		for(i=0;i<n;i++)//input
		{
			for(j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		}
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<n;j++)
			System.out.print(a[j][i]+" ");
			System.out.println();
		}
//		for(i=0;i<n;i++) {
//			for(j=0;j<n;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
    
	}

}
