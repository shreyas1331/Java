package Strings;

public class reversewordinSentence {
//INPUT="i am an online educator"
//OUTPUT="i ma na enilno rotacude"
	public static void main(String[] args) {
		String s="i am an online educator";                     //GIVEN STRING
		String ans="";                                          //EMPTY STRING
		StringBuilder sb =new StringBuilder ("");
		for(int i=0;i<s.length();i++) {                         //TRAVERSING
			char ch=s.charAt(i);                                //PICKING 1ST ELEMENT
			if(ch!=' ' ) {
				sb.append(ch);                                  //APPENDING 
			}
			else {
				sb.reverse();                                   //THEN REVERSING
				ans=ans+sb;                                     //STORING IN EMPTY STRING
				ans=ans+" ";                       
				sb=new StringBuilder("");
			}
		}
		sb.reverse();                                           //FOR LAST WORD 
		ans=ans+sb;
//		System.out.println(sb);
		System.out.println(ans);
	}

}
