package Stack2;
import java.util.*;
public class Prev_Greater {

	public static void printPrevGreater(int arr[],int n){
	    
        Stack <Integer> s=new Stack<>();//new stack
        s.add(arr[0]);//add zero
        System.out.print(-1+" ");
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && s.peek()<=arr[i])
                s.pop();
            
            
            int pg=s.isEmpty()?-1:s.peek();
            System.out.print(pg+" ");
            s.add(arr[i]);
        }
    }
	
	public static void main(String[] args) {
		int[] arr=new int[]{20,30,10,5,15};
        
        printPrevGreater(arr,arr.length); }
	}


