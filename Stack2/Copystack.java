package Stack2;
import java.util.*;
public class Copystack {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		Stack<Integer> st=new Stack<>();
		int n;
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements: ");
			for (int i=0;i<n;i++) {
				int x=sc.nextInt();
				st.push(x);
			}
			System.out.println(st);
		
		//reverse order
			Stack<Integer> rt=new Stack<>();
			while(st.size()>0)
			{
				rt.push(st.pop());
			}
			System.out.println(rt);
		//3rd stack
			Stack<Integer> gt=new Stack<>();
			while(rt.size()>0) 
			{
				gt.push(rt.pop());
			}
			System.out.println(gt);
	}

}
