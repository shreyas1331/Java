package Basic;
import java.util.Scanner;
public class age_question {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int age=sc.nextInt();
			if(age>=18) {
				System.out.print("he can vote");
			}
			else {
				System.out.print("he can't vote");
			}
		}
	}

}
