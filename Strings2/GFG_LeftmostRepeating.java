package Strings2;

public class GFG_LeftmostRepeating {

	public static void main(String[] args) {
		String s="geeksforeeks";
		solve(s);
	}
	public static void solve(String s) {
		boolean[] visited=new boolean[256];
		int res=-1;
		for(int i=s.length()-1;i>=0;i--) {
			if(visited[s.charAt(i)]) {
				res=i;
			}else {
				visited[s.charAt(i)]=true;
			}
		}
		System.out.println(res);
	}

}
