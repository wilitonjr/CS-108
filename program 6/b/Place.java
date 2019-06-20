/**
 *  Program 6b
 *  Class defining Places
 *  CS108
 *  Jun 6 2019
 *  @author  Will Rodrigues
  */

public class Place implements Comparable<Place> {
	
	//Returns the program ID and student name
	public static String progId() {
		String progId = "6b";
        String sName = "Will Rodrigues";
		return "Program " + progId + ", " + sName;	
    }
	
	// variables and arrays
	String name;
	String description;
	String[] types = new String[5];
	GeoLocation location;
	double latitude, longitude;
	
	// sets values to class given arguments
	public Place(String strName, String strDesc, double dLatitude, double dLongitude) {
		this.name = strName;
		this.description = strDesc;
		location = new GeoLocation(dLatitude, dLongitude);
	}
	
	// sets values to class given arguments
	public Place(String strName, String strDesc, double dLatitude, double dLongitude, String[] argTypes) {
		this.name = strName;
		this.description = strDesc;
		location = new GeoLocation(dLatitude, dLongitude);
		types = argTypes;
	}
	
	//sets name
	public void setName(String setName) {
		this.name = setName;
	}
	
	//returns name
	public String getName() { 
		return name;
	}
	
	//sets description
	public void setDescription(String setDescription) {
		this.description = setDescription;
	}
	
	//returns description
	public String getDescription() { 
		return description;
	}
	
	//sets location given latitude and longitude
	public void setLocation(double latitude, double longitude) {
		this.location.setLatitude(latitude);
	    this.location.setLongitude(longitude);
	}
	
	//sets location given method
	public void setLocation(GeoLocation location) {
		this.location = location;
	}
	
	//returns a location 
	public GeoLocation getLocation() {
		return location;
	}
	
	// returns a description string 
	public String toString() {
		return name + "," + description +  ",latitude:" + location.getLatitude()
				+ ",longitude:" + location.getLongitude();
	}

	// returns array types 
	public void setTypes(String[] argTypes){
		this.types = argTypes;
	}

	//returns array types	
	public String[] getTypes() {
		return types;
	}
	
	//that returns true if the locations in both places are equal based on their coordinates
	public boolean equals(Place obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
      
		return this.getLocation().equals(obj.getLocation());
	}
	 
	//return an int based off how the current Place compares to the one passed in 
	@Override
	public int compareTo(Place other) {
		return this.name.compareTo(other.getName());
	}


}