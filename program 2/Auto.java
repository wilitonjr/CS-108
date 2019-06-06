/**
 *  Program 2a
 *  20.3 Program 2a: Auto Class
 *  CS108
 *  Jun 5 2019
 *  @author  Will Rodrigues
  */

public class Auto {

	//variables
	String make;
	String model;
	int milesDriven;
	double gallonsOfGas;
	
	//no-arg method
	public Auto() {
		
	}
	
	//sets the values of variables
	public Auto(String make, int startMiles, double startGallons) {
		this.make = make;
		this.model = "";
		milesDriven = startMiles;
		gallonsOfGas = startGallons;
	}
	
	//sets the values of variables
	public Auto(String make, String model, int startMiles, double startGallons) {
		this.make = make;
		this.model = model;
		milesDriven = startMiles;
		gallonsOfGas = startGallons;
	}
	
	//returns make
	public String getMake() {
		return make;
	}
	
	//returns method
	public String getModel() {
	   return model;
	}
	
	//returns miles driven
	public int getMilesDriven() {
		return milesDriven;
	}
	
	//returns gallon of gas
	public double getGallonsOfGas() {
		return gallonsOfGas;
	}
	
	//sets miles driven
	public void setMilesDriven(int milesDriven) {
		this.milesDriven = milesDriven;
	}
	
	//sets gallons of gas
	public void setGallonsOfGas(double gallonsOfGas) {
		this.gallonsOfGas = gallonsOfGas;
	}
	
	//sets make
	public void setMake(String make) {
		this.make = make;
	}
	
	//sets model
	public void setModel(String model) {
		this.model = model;
	}
	
	//returns miles per gallon
	public double calculateMilesPerGallon() {
		return milesDriven / gallonsOfGas;
	}
	
	//returns descriptive string
	public String toString() {
		return "" + make + ", " + milesDriven + ", " + gallonsOfGas;
	}
	

	public static void main(String[] args) {
		
		
		Auto sportsCar = new Auto("Ferrari", "Fast", 0, 0.0 );
		Auto sedan1 = new Auto("BMW", "X", 449, 13.9);
		Auto sedan2 = new Auto("BMW", "i", 100, 15.0);
		Auto sedan3 = new Auto("Toyota", "Camry", 335, 9.0);
		Auto suv1    = new Auto("Jeep", "thing", 1000, 10.0);
		
		Auto[][] cars = { {sportsCar, sedan1},
							{suv1, new Auto() },
							{sedan2, sedan3} };
							
		for(int i=0; i< cars.length; i++) {
			for(int j=0; j< cars[i].length; j++) {
				System.out.println(cars[i][j]);
			}
		}
	}
	
	// Returns a string containing the programming assignment and your name
	public static String progId() {
	      return "Program 2, Will Rodrigues";
	}
	
}