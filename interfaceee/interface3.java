package interfaceee;

public interface interface3 extends interface1 , interface2{
	void size();

	void print();

	void fun3();

	int val = 14;

	default void A() {
		System.out.println("Default Method");
	}

	static void B() {
		System.out.println("Static Method");
	}

}
