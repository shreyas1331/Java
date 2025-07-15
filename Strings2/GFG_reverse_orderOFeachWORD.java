package Strings2;

public class GFG_reverse_orderOFeachWORD {

	  static void reverse(char str[],int low, int high){
		    while(low<=high){
		        //swap
		        char temp=str[low];
		        str[low]=str[high];
		        str[high]=temp;
		        //
		        low++;
		        high--;
		    }
		    }

	  static void reverseWords(char str[],int n){
		  int start=0;
		  for(int end=0;end<n;end++){
			  if(str[end]==' '){
				  reverse(str,start,end-1);
		          start=end+1;
		      }
		  }
		  reverse(str,start,n-1);
		  reverse(str,0,n-1);
		  }
	  
	  public static void main(String args[]) {
		  String s = "Welcome to Gfg";int n=s.length();
		  char[] str = s.toCharArray();
		  System.out.println("After reversing words in the string:");
		  reverseWords(str,n);
		  System.out.println(str); 
		  solve(s);
	  } 
	  public static void solve(String str) {
		  String freq[]=str.split(" ");
			int n=freq.length;
			for(int i=n-1;i>=0;i--) {
				System.out.print(freq[i]+" ");
			}
	  }

}
