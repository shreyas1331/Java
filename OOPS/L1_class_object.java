package OOPS;
class Student{
	int id;
	String name;
}
class Rectangle{
	int len;
	int breadth;
	
	void calArea() {           //methods
		System.out.print(len*breadth);
	}
}
public class L1_class_object {

	public static void main(String[] args) {
		Student Shreyas=new Student();
		System.out.println(Shreyas.id); //0
		System.out.println(Shreyas.name);// null
		Shreyas.id=1;
		Shreyas.name="Shreyas";
		//INITIALIZATION THROUGH REFERENCE
		System.out.println(Shreyas.id);
		System.out.println(Shreyas.name);
		
		Rectangle rect=new Rectangle();
		rect.len=10;
		rect.breadth=20;
		rect.calArea();
	}

}
