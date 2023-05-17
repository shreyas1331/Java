package Abstraction;

public abstract class Abstract_Demo2 extends Abstract_Demo1 {
	public static void main(String[] args) {
		Abstract_Demo1 ab = new Abstract_Demo1() {
			@Override
			public void sub(int a, int b) {
				System.out.println("sub");
			}
		};
		ab.add(2, 3);
	}

}