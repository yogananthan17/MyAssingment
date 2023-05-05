package week1.day1;

public class Car {
	public static void applyBreak() {
		System.out.println("to stop the car");
		
	}
	public static void applyGear(){
		System.out.println("to shift the gear");
	}
	public static void switchOnAc() {
		System.out.println("Air conditioning inside the car");
		
	}
	public static void applyAcclerate() {
		System.out.println("increase the car speed");
		
	}

	public static void main(String[] args) {
		Car audi=new Car();
		audi.applyBreak();
		audi.applyGear();
		audi.switchOnAc();
		audi.applyAcclerate();
	}

}