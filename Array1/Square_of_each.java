package Array1;
import java.util.*;
public class Square_of_each {

	public static void Square(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
		sum = arr[i] * arr[i];
		arr[i] = sum;
		}		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
		}
		Square(arr);
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
}	
		}
	


