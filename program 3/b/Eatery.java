/**
 *  Program 3b
 *  Sub Class Eatery extending Place
 *  CS108
 *  Jun 6 2019
 *  @author  Will Rodrigues
  */

public class Eatery extends Place {
	
	//variables
	double cost;
	String cuisine; 
	String strRating, strCostSymbol;
	int starRating; 
	
	//constructor method Eatery expanding Places
	public Eatery(String strName, String strDesc, double dLatitude, double dLongitude, 
			String strCuisine, double dCost, int iStarRating, String[] arrTypes) {
		super(strName, strDesc, dLatitude, dLongitude, arrTypes);
		
		this.cost = dCost;
		this.cuisine = strCuisine;
		this.starRating = iStarRating;
				
	}
	
	//returns cuisine
	public String getCuisine() { 
		return cuisine;
	}
	
	//returns cost
	public double getCost() { 
		return cost;
	}

	//returns price
	public int getRating() { 
		return starRating;
	}	

	//returns string containing one '*' character for each value (1 to 5)
	public String ratingToStars() {
		//this.starRating = setRatingToStars;
		if (getRating() == 1){
			strRating = "*";	
		}
		else if (getRating() == 2){
			strRating = "**";	
		}
		else if (getRating() == 3){
			strRating = "***";	
		}
		else if (getRating() == 4){
			strRating = "****";	
		}
		else {
			strRating = "*****";
		}
		return strRating;
	}

	//returns string containing aount of $'s depending on price
	public String getCostToSymbols() {
		if (cost < 25.0){
			strCostSymbol = "$";	
		}
		else if (cost < 50.0){
			strCostSymbol = "$$";	
		}
		else if (cost < 75.0){
			strCostSymbol = "$$$";	
		}
		else if (cost < 100.0){
			strCostSymbol = "$$$$";	
		}
		else {
			strCostSymbol = "$$$$+";	
		}
		
		return strCostSymbol;
	}
	
	// returns a description string 
	public String toString() {
		return name + " (latitude:" + location.getLatitude()
				+ ",longitude:" + location.getLongitude() + 
				")\n\tPrice: " + getCostToSymbols() + "\n\tRating: "+ 
				ratingToStars();
	}

}