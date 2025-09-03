package OOPS;
abstract class Shape{
	abstract void draw();
}
class Circle extends Shape{
	void draw() {System.out.println("drawing circle");}
}
class Rect extends Shape{
	void draw() {System.out.println("drawing rect");}
}
public class L7_abstraction {

	public static void main(String[] args) {
		Shape s=new Circle();
		s.draw();

	}
//we can have abstract and non abstract methods
}
