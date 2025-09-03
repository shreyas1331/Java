package OOPS;
//we are creating static methods so that we don't need to create instance
//for calling methods.
class Adder{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class L5_methodOverloading {

	public static void main(String[] args) {
//		Adder obj=new Adder();
		System.out.println(Adder.add(4, 8));
		System.out.println(Adder.add(5, 8, 9));
	}
}
