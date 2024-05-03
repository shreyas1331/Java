package TwoD_array;
import java.util.Scanner;
public class pascal_tri {

	static void printMatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int [][] pascal(int n){
		
		int [][] ans = new int[n][];
		for(int i=0;i<n;i++) {
			ans[i]=new int[i+1];        //1. ith row has i+1 colms
			
			ans[i][0]=ans[i][i]=1;       //2. 1st and last element of every row is 1
			
			for(int j=1;j<i;j++) {	     //3. sum of upper two elements
				ans[i][j]=ans[i-1][j] + ans[i-1][j-1];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int[][]ans=pascal(n);
		printMatrix(ans);
	}

}
