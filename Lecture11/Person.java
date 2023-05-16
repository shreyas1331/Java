package Lecture11;

public class Person {
	
	int a=10;
	String b="abc";
	
	public Person() {
	}
	
	public Person(String a , int b) {
		System.out.println("StringInt");
		}
	public Person(int a , String b) {
		System.out.println("IntString");
		}
	
	public void print() {
		System.out.println("Hello");
	}

}