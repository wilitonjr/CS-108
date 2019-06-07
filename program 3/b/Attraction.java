/**
 *  Program 3b
 *  Sub Class attraction extending Place
 *  CS108
 *  Jun 6 2019
 *  @author  Will Rodrigues
  */

public class Attraction extends Place {
	
	//variables
	double price;
	boolean resultHasAnimals = false;

	//constructor method Attraction expanding the method place
	public Attraction(String strName, String strDesc, double dLatitude, 
		double dLongitude, double dPrice, String[] argTypes) {
		super(strName, strDesc, dLatitude, dLongitude, argTypes);
		
		this.price = dPrice;
	}
	
	//returns price
	public double getPrice() { 
		return price;
	}
	
	//returns if has animals
	public boolean hasAnimals() {
		for(int i = 0; i < types.length; i++){
			switch(types[i]) {
			case "zoo":
				resultHasAnimals = true;
				break;
			case "aquarium":
				resultHasAnimals = true;				 
				break;
		}
		}
		return resultHasAnimals;
	}
	
	// returns a description string 
	public String toString() {
		String strHasAnimals ="";
		if (hasAnimals() == true){
			strHasAnimals = " and feature exciting animals";
		}	
		return name + " (latitude:" + location.getLatitude()
				+ ",longitude:" + location.getLongitude() + 
				")\n\tTickets average $" + String.format("%.2f", price)  + strHasAnimals;
	}

}

