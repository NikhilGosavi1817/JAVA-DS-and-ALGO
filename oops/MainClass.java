package oops;

class Cat {
	boolean hasFur;
	String breed;
	int legs, eyes;

	public void walk() {
		System.out.println("Cat is walking");
	}

	public void eat() {
		System.out.println("Cat is eating");
	}

	public void description() {
		System.out.println("Cat has " + legs + " legs and " + eyes + " eyes");
	}
}

class Dog {
	String name, breed;

	public void jump() {
		System.out.println("my dog " + name + " jumped");
	}

	public void description() {
		System.out.println("my dog's name is " + name + " and it's breed is " + breed);
	}

}

public class MainClass {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();

		cat1.legs = 3;
		cat1.eyes = 2;

		cat2.legs = 4;
		cat2.eyes = 1;

		cat1.description();
		cat2.description();

		Dog tommy = new Dog();
		Dog thomas = new Dog();

		tommy.name = "Tommy";
		tommy.breed = "German";

		thomas.name = "Thomas";
		thomas.breed = "Hulk";
		
		tommy.jump();
		tommy.description();
		
		thomas.jump();
		thomas.description();
	}

}
