/**
 *  Program 3b
 *  GeoLocation
 *  CS108
 *  Jun 6 2019
 *  @author  Will Rodrigues
  */

public class GeoLocation {
	
	//constant and variables
	double EARTH_RADIUS_MILES = 3963.1676;
	double latitude, longitude;
	
	//Returns the program ID and student name
	public static String progId() {
		String progId = "2b";
        String sName = "Will Rodrigues";
		return "Program " + progId + ", " + sName;	
    }
	
	public GeoLocation() {
    }
	
	//sets latitude and longitude
	public GeoLocation(double lat, double lon) {
		this.latitude = lat;
		this.longitude = lon;
    }
	
	//gets latitude
	public double getLatitude() { 
		return latitude;
	}
	
	//gets longitude
	public double getLongitude() { 
		return longitude;
	}
	
	//sets latitude
	public void setLatitude(double lat) {
		this.latitude = lat;
	}
	
	//sets longitude
	public void setLongitude(double lon) {
		this.longitude = lon;
	}
	
	//calculates distance between two points on Earth
	public double distanceFrom(GeoLocation other) {
		double lat1 = Math.toRadians(this.getLatitude());
		double lon1 = Math.toRadians(this.getLongitude());
		double lat2 = Math.toRadians(other.getLatitude());
		double lon2 = Math.toRadians(other.getLongitude());
		double cosC = Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1)
		* Math.cos(lat2) * Math.cos(lon1 - lon2);
		double arcLenC = Math.acos(cosC);
		return arcLenC;
	}
	
	//returns true for equal latitudes and longitudes
	public boolean equals(GeoLocation obj) {
	       if (this == obj)
	           return true;
	       if (obj == null)
	           return false;
	       if (Double.doubleToLongBits(latitude) != Double
	               .doubleToLongBits(obj.latitude))
	           return false;
	       if (Double.doubleToLongBits(longitude) != Double
	               .doubleToLongBits(obj.longitude))
	           return false;
	       return true;
	   }
}
