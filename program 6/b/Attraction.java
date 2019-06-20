/**
 *  Program 6b
 *  Sub Class attraction extending Place
 *  CS108
 *  Jun 18 2019
 *  @author  Will Rodrigues
  */

public class Attraction extends Place {
	
	//variables
	double price;
	boolean resultHasAnimals = false;
	int intType = 0;

	//constructor method Attraction expanding the method place
	public Attraction(String strName, String strDesc, double dLatitude, 
		double dLongitude, double dPrice, String[] argTypes) {
		super(strName, strDesc, dLatitude, dLongitude, argTypes);
		
		this.price = dPrice;
	}
	
	//constructor method Attraction expanding the method place
	public Attraction(String strName, String strDesc, double dLatitude, 
			double dLongitude, double dPrice, int intTypes) {
			super(strName, strDesc, dLatitude, dLongitude);
			
			this.price = dPrice;
			this.intType = intTypes;
		}

	//returns price
	public double getPrice() { 
		return price;
	}

/*
 * FOR FUTURE REFERENCE
 * in case the type of the attraction hasAnimals
 * use an string array to returns true or false*/
	
//	//returns if has animals
//	public boolean hasAnimals() {
//		for(int i = 0; i < types.length; i++){
//			switch(types[i]) {
//			case "zoo":
//				resultHasAnimals = true;
//				break;
//			case "aquarium":
//				resultHasAnimals = true;				 
//				break;
//		}
//		}
//		return resultHasAnimals;
//	}
/* ENDS REFERENCE*/
	
	
	//returns if has animals
	public boolean hasAnimals() {
		
		if (intType == 1){
			resultHasAnimals = true;
		}
		return resultHasAnimals;
	}
	
	// returns a description string 
	public String toString() {
		String strHasAnimals ="";
		if (hasAnimals() == true){
			strHasAnimals = " and feature exciting animals";
		}	
		return name + "," + description + ", (latitude:" + location.getLatitude()
				+ ",longitude:" + location.getLongitude() + 
				")\n\tTickets average $" + String.format("%.2f", price)  + strHasAnimals;
	}

}

