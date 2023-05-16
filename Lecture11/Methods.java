package Lecture11;

public class Methods {
	public static void main(String[] args) {
		add(5, 6);
		Methods m = new Methods();
		m.sub(6, 7);
	}

	private void sub(int i, int j) {
		System.out.println(i - j);
	}

	private static void add(int i, int j) {
		System.out.println(i - j);
	}
	
	static {
		System.out.println("Inside Static Block");
	}

}