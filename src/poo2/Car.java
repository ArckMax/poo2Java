package poo2;

public class Car extends Vehicle {

	public Car(String brand) {
		super(brand);
	}
	
	public String doStuff() {
		return "Je suis un/une " + getBrand() + " et je fais vroum vroum !";
	}
	
}