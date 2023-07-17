package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("Drive  car");
	}
	public void applyBreak() {
		System.out.println("Apply break");
	}	
	public void pressSoundHorn() {
		System.out.println("pressSoundHorn");
	}
	public static void main(String[] args) {
		Car myCar= new Car();
		myCar.applyBreak();
		myCar.pressSoundHorn();
		myCar.driveCar();
		
		
		
	}
}
