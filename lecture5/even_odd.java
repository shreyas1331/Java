package lecture5;
import java.util.Scanner;
public class even_odd {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int number=sc.nextInt();
			if(number%2==0) {
				System.out.print("even");
			}
			else {
				System.out.print("odd");
			}
		}
	}

}
