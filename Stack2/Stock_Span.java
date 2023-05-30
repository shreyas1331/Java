package Stack2;
import java.util.*;
public class Stock_Span {

	public static void printSpan(int arr[],int n){
        Stack<Integer> s=new Stack<>() ;//create a stack
        s.add(0);//process first item
        System.out.print(1+" ");//print 1
        
        for(int i=1;i<n;i++){//starting with second element
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty() ? i+1 : i-s.peek();//if stack is empty then i+1
            										//else take previous 
            System.out.print(span+" ");
            s.push(i);//process remaining items
        }
        System.out.print("END");
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int[] arr=new int[]{18,12,13,14,11,16};
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        printSpan(arr,arr.length); 	
		
	}

}
