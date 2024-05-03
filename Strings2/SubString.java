package Strings2;

public class SubString {

	public static void main(String[] args) {
		String str="abcd";//0 to 3
		int cnt=0;
		for(int i=0;i<=3;i++) {
			for(int j=i+1;j<=4;j++) {
				System.out.print(str.substring(i,j)+" ");
				cnt++;
				System.out.println();
			}
		}
		System.out.println(cnt);
	}
}
