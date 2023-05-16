package lecture4;

public class hardpattern1 {

	public static void main(String[] args) {
		//1234554321
		//1234**4321
		//123****321
		//12******21
		//1********1
		int n=5;  
		//inner loop
		int i= 0;  
		while(i< n)  
		{  
		//outer loop  
		int z=1;
		int j=1;
		while(j<=n-i)  
		{  
		System.out.print(z);  
		z++;

		j++;
		}
		int k=0;
		while(k<=i-1)  
		{  
		System.out.print("*");

		k++;
		} 
		k=0;
		while(k<=i-1)  
		{  
		System.out.print("*");

		k++;
		} 
		
		for( j=5-i;j>=1;j--) {
			System.out.print(j);
		}

		System.out.println("");  
		i++;
		}  
	}
}

