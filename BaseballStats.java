/**
 *  Exam 1
 *  May 30 2019
 *  Wiliton Rodrigues
*/

import java.util.Random;

public class BaseballStats {

	public static void main(String[] args) {
	
		
		// Declare and initialize arrays
		String[] players = {"Babe Ruth", "Willie Mays", "Barry Bonds", "Ted Williams", "Hank Aaron"};
		int[] atBats = { 8399, 10881, 9847,  7706, 12364};
		int[] hits = { 2873, 3283, 2935,  2654, 3771};
		
		//Display a roster of the five players
		for (int i = 0; i < players.length; i++) { 
            		System.out.println(i+1 + " "+ players[i]);
        	}
		System.out.println("");
		
		//get the random number
		int randomNumber = (int)(players.length * Math.random());
		
		// calculate average and prepare it to display
		double avg = 0;
		double h = hits[randomNumber];
		double b = atBats[randomNumber];
		avg = h / b;
		String strAvg = String.format("%.3f", avg);
		
		//Display the name, at bats, hits, and batting average of a *random player in the list
		System.out.println(players[randomNumber] + " AB: " + atBats[randomNumber] + " H: " + hits[randomNumber] + " Ave: " + strAvg);
	}
}
