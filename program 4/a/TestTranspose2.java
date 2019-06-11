/**
 *  Program 4a - part 2
 *  Transpose Array Programming Assignment 
 *  CS108
 *  Jun 11 2019
 *  @author  Will Rodrigues
  */

import java.util.Scanner;

public class TestTranspose2 {

	
	//Returns the program ID and student name
	public static String getIdentificationString() {
		String progId = "4a";
        String sName = "Will Rodrigues";
		return "Program " + progId + ", " + sName;	
    }
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//gets input from user
		int row = sc.nextInt();
		int cols = sc.nextInt();

		
		//calls methods on Transpose2.java
		Transpose2 t = new Transpose2(row, cols);
		t.print2DArray();
	    t.print2DArrayTransposed();
	}



}
