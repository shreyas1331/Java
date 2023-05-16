package String1;

import java.util.StringTokenizer;

public class String_Token {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Sky is blue");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("----------");

		StringTokenizer st1 = new StringTokenizer("Skaya isa blaue", "a");

		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		System.out.println("----------");

		StringTokenizer st2 = new StringTokenizer("Skaya isa blaue", "a", false);

		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

		System.out.println("----------");
		StringTokenizer st3 = new StringTokenizer("Sky:is:blue", ":", true);

		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}

}
