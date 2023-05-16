package assi_ques;
import java.util.*;
//Fibonacci Series is defined by the recurrence
//F(n) = F(n-1) + F(n-2)

public class q2_fibbo {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
        int b=1;
        if(n==0)
        {
            System.out.print(" true");
        }
        while((a+b)<=n)
        {int temp=a+b;
         a=b;
         b=temp;
         // 
         if(n==temp )
         {
        	 System.out.print("true");
         }
        }
        System.out.print("false");
		
	}

}