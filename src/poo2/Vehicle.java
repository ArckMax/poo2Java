package poo2;

public abstract class Vehicle {
	
//	Attributes
	private String brand;
	private int kilometers;
	
//	Constructor
	public Vehicle(String brand) {
		this.brand = brand;
		this.kilometers = 0;
	}
	
// Getters & Setters
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	public abstract String doStuff();
	
}
