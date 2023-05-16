package Strings;

public class CBNumber {

	public static void main(String[] args) {
		String s="81615";
		
		for(int len=1;len<=s.length();len++) {
			for(int i=0;i<=s.length()-len;i++) {
				String k=s.substring(i,i+len);
				if(isCBNumber(Integer.parseInt(k))) {
				System.out.println(k);
				}
			}
		}
	}

	private static boolean isCBNumber(int parseInt) {

		return false;
	}

}
