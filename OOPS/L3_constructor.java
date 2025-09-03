package OOPS;
class Bache{
	int id;
	String name;
	
	Bache(){
		System.out.println("constructor called itself");
	}
	Bache(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println("ur id is :"+id+" and ur name is :"+name);
	}
}
public class L3_constructor {

	public static void main(String[] args) {
		Bache s1=new Bache(7,"rohan");
		Bache s2=new Bache(8,"shreyas");
		
		
		s1.display();
		s2.display();
	}

}
