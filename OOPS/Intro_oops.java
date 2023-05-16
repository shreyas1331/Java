 package OOPS;

public class Intro_oops {
	String color;
	String type;//properties
	public void write() {
		System.out.print("writing something");
	}
	public void printColor() {
		System.out.println(this.color);
	}
	
//	class student{
//		String name;
//		int age;
//		public void printInfo() {
//			
//		}
//	}
	
	public static void main(String[] args) {
		Intro_oops pen1=new Intro_oops();
		pen1.color="blue";
		pen1.type="gel";
		
		Intro_oops pen2=new Intro_oops();
		pen2.color="black";
		pen2.type="ballpoint";
		
		pen1.printColor();
		pen2.printColor();
		
	}

}
