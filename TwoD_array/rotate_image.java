package TwoD_array;

import java.util.Scanner;
//ROTATE ANTICLOCKWISE
public class rotate_image {
	public static void transpose(int[][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a[0].length;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
	}
	public static void reverse(int[]arr) {
		int i=0;int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		transpose(a);
		for(int i=0;i<a.length;i++) {
			reverse(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
    
	}

}
