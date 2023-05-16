package TwoD_array;
import java.util.Scanner;
public class user_input {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int rows=sc.nextInt();
			int cols=sc.nextInt();
			int[][]arr=new int[rows][cols];
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					int temp=arr[i][0];
					arr[i][0]=arr[i][cols-1];
					arr[i][cols-1]=temp;
					System.out.print(arr[i][j]+" ");
				}System.out.println();
			}
			
		}
	}

}
