package Array1;

import java.util.Scanner;

public class armstrong_number {

		public static void main(String args[]) {
			try (Scanner sc = new Scanner(System.in)) {
				int n=sc.nextInt();
				int m=sc.nextInt();
				armstrong(n,m);
			}
	    }
		public static void armstrong(int n,int m){
			int i=n;
			for(i=n;i<=m;i++){
				int s=0;
				int t=i;
				while(t!=0){
					int r=t%10;
					s=s+r*r*r;
					t/=10;
				}
				if(s==i)
				System.out.println(i);
			}
		}
	}


