package TwoD_array;
import java.util.Scanner;
public class transpose {
	
	static void printMatrix(int[][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int[][] findTranspose(int [][] matrix, int r,int c){
		int[][]ans=new int[c][r];
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				ans[i][j]=matrix[j][i];
			}
		}
		return ans;
	}
	static void transposeInPlace(int [][] matrix ,int r,int c) {
		for(int i=0;i<c;i++) {
			for(int j=i;j<r;j++) {   //remeber this j=i because two times swap ho raha hai
				//swap
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}
	
	static void reverseArray(int[]arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	static void rotate(int[][]matrix,int n) {
		//transpose
		transposeInPlace(matrix,n,n);
		//reverse each row of transposed matrix
		for(int i=0;i<n;i++) {
			
			reverseArray(matrix[i]);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]a=new int [r][c];
		//input
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix 1");
		printMatrix(a);
		
		System.out.println("transpose is:");
		int [][] ans=findTranspose(a,r,c);
		printMatrix(ans);
		
		
		System.out.println("transposeInPlace is:");
		transposeInPlace(a,r,c);
		printMatrix(a);
		System.out.println("rotation of matrix");
		rotate(a,r);
		printMatrix(a);
	}

}
