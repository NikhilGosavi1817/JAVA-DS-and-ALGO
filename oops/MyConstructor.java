package oops;

class Vehicle {
	int wheels;
	int headLights;
	String color;

	Vehicle(int wheels) {
		this.wheels = wheels;
		headLights = 2;
	}

	Vehicle(int wheels, String color) {
		this.wheels = wheels;
		this.color = color;
	}

}

public class MyConstructor {

	MyConstructor() {
		System.out.println("he");
	}

	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();

		Vehicle car = new Vehicle(4);
		Vehicle bike = new Vehicle(2);
		System.out.println(car.wheels + " wheels");
		System.out.println(car.headLights + " headLights");
		System.out.println(bike.wheels + " wheels");
		System.out.println(bike.headLights + " headLights");

		Vehicle bus = new Vehicle(8, "Red");
		System.out.println(bus.wheels + " wheels and color is " + bus.color);
	}

}
