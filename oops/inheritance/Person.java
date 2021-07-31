package oops.inheritance;

public class Person {

	public Person(String name) {
		this.name=name;
		System.out.println("inside person constructor");
	}
	protected String name;
	
	public void walk() {
		System.out.println("Person "+name+" is walking");
	}
	
	public void eat() {
		System.out.println("Person "+name+" is eating");
	}
		
	public static void laughing() {
		System.out.println("Person is laughing");
	}
	
}
