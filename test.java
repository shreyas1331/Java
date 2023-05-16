import java.util.Scanner;

public class test {
//	int arr[]= {2,9,4,6,3,7};
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		StringBuilder sb=new StringBuilder(str);
		int[]freq=new int[sb.length()];
		for(int i=0;i<sb.length()-1;i++) {
			freq[i]=1;
			for(int j=i+1;j<=sb.length()-1;j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					freq[i]++;
					sb.setCharAt(j,'0');
				}
			}
		}
		int max=freq[0];
		int index=0;
		for(int i=0;i<=freq.length-1;i++) {
			if(freq[i]>max) {
				max=freq[i];
				index=i;
			}
		}
		System.out.println(sb.charAt(index));

	
		
	}

}
