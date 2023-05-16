package interfaceee;

public class InterfaceClient implements interface3 {

	@Override
	public void display() {
		System.out.println("Display");
	}

	@Override
	public void fun() {
		System.out.println("Fun");
	}

	@Override
	public void fun2() {
		System.out.println("Fun2");
	}

	@Override
	public void size() {
		System.out.println("Size");
	}

	@Override
	public void print() {
		System.out.println("Print");
	}

	@Override
	public void fun3() {
		System.out.println("Fun3");

	}

	public static void main(String[] args) {
		InterfaceClient s = new InterfaceClient();
		s.display();
		s.fun();
		System.out.println(interface2.val);
		System.out.println(interface3.val);
	}
}
