package Arrays2;

import java.util.Scanner;

public class searching {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size=sc.nextInt();
			int numbers[]=new int[size];
			//input
			for(int i=0;i<size;i++) {
				numbers[i]=sc.nextInt();
			}
			int x=sc.nextInt();
			//output
			for(int i=0;i<numbers.length;i++) {
				if(numbers[i]==x) {
					System.out.print("x found at index:"+i);
				} 
			}
		}
	}

}
