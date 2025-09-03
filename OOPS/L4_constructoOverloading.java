package OOPS;
class Children{
	int id;
	String name;
	String cast;
	
	Children(){
		System.out.println("constructor called itself");
	}
	Children(int i,String n){
		id=i;
		name=n;
	}
	Children(int i,String n,String c){
		id=i;
		name=n;
		cast=c;
	}
	void display() {
		System.out.println("ur id is :"+id+" and ur name is :"+name + cast);
	}
	
}
public class L4_constructoOverloading {

	public static void main(String[] args) {
		Children s1=new Children(7,"rohan");
		Children s2=new Children(8,"shreyas","mahajan");
		
		
		s1.display();
		s2.display();
	}

}
