package module1;

class Car{
	// These are the attributes for Car class.
	String brand, model;
	int year;
	
	// Constructor - for setting the attribute values
	Car(String b, String m, int y){
		this.brand=b;
		this.model=m;
		this.year=y;
	}
	
	// Methods - functions inside the class
	void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year + "\n");
	}
}

public class Main {

	public static void main(String[] args) {
		// Object instantiation (Creating an instant of the Car class).
		Car car1 = new Car("Ford","F-150", 2010);
		Car car2 = new Car("BMW", "X6",2026);
	
		// Accessing member methods.
		// Calling method of Car class. 
		car1.displayInfo();
		car2.displayInfo();
		
		car1.year=2015;
		car1.model="F-250";
		
		car1.displayInfo();
		

	}

}
