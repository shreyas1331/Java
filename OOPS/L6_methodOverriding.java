package OOPS;
class Bikes{
	void run() {
		System.out.println("bike started");
	}
}
class Ktm extends Bikes{
	void run() {
		System.out.println("ktm bike started");
	}
}
public class L6_methodOverriding {

	public static void main(String[] args) {
		Bikes b1=new Bikes();
		b1.run();
	}

}
