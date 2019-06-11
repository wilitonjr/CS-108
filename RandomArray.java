/**
 *  Program 4b
 *  Random Array Programming Assignment 
 *  CS108
 *  Jun 11 2019
 *  @author  Will Rodrigues
  */

import java.util.Random;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RandomArray {

	//returns reversed array. X-array
	public static int[] createXArray(int x) throws ArrayIndexOutOfBoundsException {
		
		int[] array = new int[x]; 
		int[] arrayTemp = new int[x];
		
        for (int i = 1; i <= x; i++) { 
        	arrayTemp[i-1] = i; 
        }
        int j = 0;
        for (int i = arrayTemp.length; i > 0; i--) {	
        	array[j] = arrayTemp[i-1]; 
        	j = j + 1;
        }
	
		return array;
	}
	
	//returns the requested random Y-array. Based on given size and previous X-array
	public static int[] createYArray(int x, int[] xArray) throws ArrayIndexOutOfBoundsException {
		
		Random rand = new Random(123);
		int[] yArray = new int[x];
		int randomNumber;
		
        for (int i = 0; i < x; i++) { 
        	randomNumber = rand.nextInt(xArray.length);
        	yArray[i] = xArray[randomNumber]; 
        }
		return yArray;
	}
	
	// prints array on file
	public static void printArray(int[] arrayReceived) throws FileNotFoundException, UnsupportedEncodingException {
		
		int [] arrayToPrint = arrayReceived;
		PrintWriter outFile = new PrintWriter("output.txt", "UTF-8");
		
		for (int i=0; i<arrayToPrint.length; i++){
			outFile.print(arrayToPrint[i] + " ");
		}
		outFile.close();
    }
	

	
	//Returns the program ID and student name
	public static String getIdentificationString() {
		String progId = "4a";
        String sName = "Will Rodrigues";
		return "RandomArray, " + sName;	
    }
	
	
	public static void main(String[] args) throws IOException {
			
		Scanner in = new Scanner(System.in);
		
		//reads arrays sizes
		int sizeArrayX = Integer.parseInt(in.next());
		int sizeArrayY = Integer.parseInt(in.next());				
		
		//calls methods to create X and Y arrays 
		int arrayX[] =  createXArray(sizeArrayX);
		int arrayY[] =  createYArray(sizeArrayY, arrayX);		
		
		//prints a test
		for (int i=0; i<arrayX.length; i++){
			System.out.print(arrayX[i] + " ");
		}
		System.out.println("");
		for (int i=0; i<arrayY.length; i++){
			System.out.print(arrayY[i] + " ");
		}
		
		//calls method to print on file
		printArray(arrayY);
	}
}