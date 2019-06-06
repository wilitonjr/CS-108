/**
 *  Program 2c
 *  Auto Class - Program to print a list of cars, with their location in latitude and longitude
 *  				Also prints the distance between the cars in miles
 *  CS108
 *  Jun 5 2019
 *  @author  Will Rodrigues
  */

public class CarMax {
	
	//Returns the program ID and student name
	public static String progId() {
		String progId = "2c";
        String sName = "Will Rodrigues";
		return "Program " + progId + ", " + sName;	
    }	

	//Constructs double array with location
	public static Double[][] getLocations(Double[] lats, Double[] longs) { 
		Double arrayLocations [][] = {lats,longs};
		return arrayLocations;
	}
	
	//calculates distance between two points in miles
	public static double distanceFrom(double lat1, double lon1, double lat2, double lon2) {
		double theta = lon1 - lon2;
		double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
		dist = Math.acos(dist);		
		dist = Math.toDegrees(dist);
		dist = dist * 60 * 1.15284;
		return dist;
	}
	
	public static void main(String[] args) {
		
		//Arrays
		Double[] latitudes = { 48.858093, -3.070000, 27.173891, 51.501476, -22.9519};
		Double[] longitudes = { 2.294694, 37.349998, 78.042068, -0.140634, -43.2104};
		String[] Auto = { "Ferrari", "BMW", "Audi", "MAZDA", "Jeep" };
		Double[][] GeoLocation = getLocations(latitudes, longitudes);
		
		// prints the heather of the table
		System.out.println("Vehicle  Latitude Longitude");
		System.out.println("---------------------------");
		
		// prints the list of cars with their latitudes and longitudes 
		for (int i = 0; i < GeoLocation[0].length; i++){	
			System.out.print(Auto[i] + " ");
	         for (int j = 0; j < GeoLocation.length; j++){
	        	 String strGeoLocation = String.format("%.3f", GeoLocation[j][i]);	 
	        	 System.out.print(strGeoLocation + " ");
	         }
	         System.out.println("");
	      }
		System.out.println("");
		
		// prints the list of cars with their distances in miles
		for (int i = 0; i < Auto.length; i++){	
	         for (int j = 0; j < Auto.length; j++){
	        		 if (i != j){

	        			 //calls method to calculate distance between two cars. Then prints it. 
	        			 String distanceCars = String.format("%.1f", distanceFrom(latitudes[i], longitudes[i], latitudes[j], longitudes[j]));
	        			 System.out.println("");
	        			 System.out.print("Distance from " + Auto[i] + " to " + Auto[j] + ": " 
	        					 + distanceCars + " miles"); 
	        		 }
	         }
	         System.out.println("");
	      }
	}
}

