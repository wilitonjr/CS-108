public class Auto {

	String make;
	String model;
	int milesDriven;
	double gallonsOfGas;
	
	public Auto() {
		
	}
	public Auto(String make, int startMiles, double startGallons) {
		this.make = make;
		this.model = "";
		milesDriven = startMiles;
		gallonsOfGas = startGallons;
	}
	public Auto(String make, String model, int startMiles, double startGallons) {
		this.make = make;
		this.model = model;
		milesDriven = startMiles;
		gallonsOfGas = startGallons;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
	   return model;
	}
	public int getMilesDriven() {
		return milesDriven;
	}
	public double getGallonsOfGas() {
		return gallonsOfGas;
	}
	public void setMilesDriven(int milesDriven) {
		this.milesDriven = milesDriven;
	}
	public void setGallonsOfGas(double gallonsOfGas) {
		this.gallonsOfGas = gallonsOfGas;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double calculateMilesPerGallon() {
		return milesDriven / gallonsOfGas;
	}
	public String toString() {
		return "" + make + " " + model + ", " + milesDriven + ", " + gallonsOfGas;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (Double.doubleToLongBits(gallonsOfGas) != Double.doubleToLongBits(other.gallonsOfGas))
			return false;
		if (milesDriven != other.milesDriven)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		return true;
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
	
	//(0) Returns a string containing the programming assignment and your name
	public static String progId() {
	      return "Program 2, Patty Kraft";
	}
	
}