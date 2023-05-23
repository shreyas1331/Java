package Array1;

import java.util.Scanner;

public class frequency {
//find the frequency of each digit in the given array.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr=new int[size];
		for (int i=0 ; i<size ; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=9;i++) {
			int c=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
					c++;
				}
			}
			System.out.println(c+" ");
		}

	}

}
