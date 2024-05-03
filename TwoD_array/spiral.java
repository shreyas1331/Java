package TwoD_array;
import java.util.*;
public class spiral {
//	3 4
//	1 2 3 4
//	5 6 7 8
//	9 10 11 12
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int r=sc.nextInt(); int c=sc.nextInt();
		int[][]arr=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int leftCol=0,rightCol=c-1,topRow=0,bottomRow=r-1;
		int totalElements=0;
		while(totalElements<r*c) {
			for(int j=leftCol;j<=rightCol && totalElements<r*c;j++) {
				System.out.print(arr[topRow][j]+" ");
				totalElements++;
			}
			topRow++;
			for(int i=topRow;i<=bottomRow && totalElements<r*c;i++) {
				System.out.print(arr[i][rightCol]+" ");
				totalElements++;
			}
			rightCol--;
			for(int j=rightCol;j>=leftCol && totalElements<r*c;j--) {
				System.out.print(arr[bottomRow][j]+" ");
				totalElements++;
			}
			bottomRow--;
			for(int i=bottomRow;i>=topRow && totalElements<r*c;i--) {
				System.out.print(arr[i][leftCol]+" ");
				totalElements++;
			}
			leftCol++;
		}
	}
}
