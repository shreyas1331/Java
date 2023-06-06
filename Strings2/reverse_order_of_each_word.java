package Strings2;
import java.util.*;
public class reverse_order_of_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=new String(sc.nextLine());
		String freq[]=str.split(" ");
		int n=freq.length;
		for(int i=n-1;i>=0;i--) {
			System.out.print(freq[i]+" ");
		}
	}

}