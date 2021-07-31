package oops.abstraction;

public class RepairShop extends Car{

	public static void repairCar(Car car) {
		System.out.println("car is repaired");
	}
	
	
	public static void main(String[] args) {
		
		WagnoR wagnoR =new WagnoR();
		Audi audi =new Audi();
		
		repairCar(wagnoR);
		repairCar(audi);
		
	}


	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		
	}

}
