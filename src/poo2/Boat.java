package poo2;

public class Boat extends Vehicle {
	
	public Boat(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	public String doStuff() {
		return "Je suis un/une " + getBrand() + " et je fais glou glou !";
	}	
}