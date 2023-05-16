 package TwoD_array;

public class SpiralPrint {
//output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
	public static void main(String[] args) {
		int [][]arr= {{1,2,3,4},
					  {5,6,7,8},
					  {9,10,11,12},
					  {13,14,15,16}};
		int minrow=0;
		int mincol=0;
		int maxcol=arr[0].length-1;
		int maxrow=arr.length-1;
		int total=arr.length*arr[0].length;
		int count=1;
		while(mincol<=maxcol && minrow<=maxrow) {
		for(int i=minrow;i<=maxcol && count<=total;i++) {
			System.out.print(arr[minrow][i]+" ");
			count++;
		}
		minrow++;
		for(int i=minrow;i<=maxrow && count<=total;i++) {
			System.out.print(arr[i][maxcol]+" ");
			count++;

		}
		maxcol--;
		for(int i=maxcol;i>=mincol && count<=total;i--) {
			System.out.print(arr[maxrow][i]+" ");
			count++;

		}
		maxrow--;
		for(int i=maxrow;i>=minrow && count<=total;i--) {
			System.out.print(arr[i][mincol]+" ");
			count++;

		}
		mincol++;
		}
	}
	}


