/**
 *  Program 6b
 *  PlacesToGo class
 *  CS108
 *  Jun 18 2019
 *  @author  Will Rodrigues
  */

import java.util.ArrayList;
import java.util.Collections;

public class PlacesToGo {
	
	static ArrayList<Place> places = new ArrayList<>();
	
	//print all places
	public static void print() {
		for(Place p: places) {
	           System.out.println(p);
	       }
	}
	
	//sort and print all places
	public static void printSorted() {
		Collections.sort(places);
	    for(Place p: places) {
	        System.out.println(p);
	    }
	}
	

   public static void main(String[] args) {
      
       //all given places
       Place p1 = new Place("New York", "One very large city", 100.2, 150.1283);
       Place p2 = new Place("Los Angeles", "City of angels", 54.89, -100.3);
       Place p3 = new Eatery("Chilis", "American sized food", 36.265, 127.387, "American", 30, 3, null);
       Place p4 = new Eatery("Panda Express", "My Favorite Place", -117.479, -27.968, "Chinese", 10, 4, null);
       Place p5 = new Attraction("County Fair", "Janky rides", -23.27, 237.387, 25, 3);
       Place p6 = new Attraction("San Diego Zoo", "Harambe lives in our hearts", -45.27, 28.39, 40, 1);
      
       //add all given places
       places.add(p1);
       places.add(p2);
       places.add(p3);
       places.add(p4);
       places.add(p5);
       places.add(p6);
      
       //print all places and then print again, but sorted
       print();
       System.out.println();
       printSorted();
      
   }

}