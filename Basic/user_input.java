package Basic;
import java.util.Scanner;
public class user_input {

	public static void main(String[] args) {
		try (//input
		Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();//1st variable
			int b=sc.nextInt();//2nd variable
			//nextInt
			//nextFloat
			int sum=a+b;
			System.out.print(sum);
		}
		
	}

}
