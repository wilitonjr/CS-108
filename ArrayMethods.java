/**
 *  Program 1b
 *  Arrays useful
 *  CS108
 *  May 28 2019
 *  @author  Will Rodrigues
  */


public class ArrayMethods {
	
	// Return student name and program ID
	public static String progId() 
    {
		String progId = "1b";
        String sName = "Wiliton Rodrigues";
		return "Program " + progId + ", " + sName;	
    }
	
	// Find Minimum value of an array
	public static int findMin(int[] testData) 
    {
		int minValue = testData[0];
		for(int i=1;i<testData.length;i++){
			if(testData[i] < minValue){
				minValue = testData[i];
			}
		}
		return minValue;	
    }
	
	// Find the index of the minimum value of an array
	public static int findMinIndex(int[] testData) 
    {
		int minValue = testData[0];
		int minIdex = 0;
		for(int i=1;i<testData.length;i++){
			if(testData[i] < minValue){
				minValue = testData[i];
				minIdex = i;
			}
		}
		return minIdex;	
    }
	
	//reverse values of an array
	public static int[] reverse(int[] testData) 
    { 	
		int[] reversedData = new int[testData.length];
		int n = testData.length;
		int i, k, t; 
		
		for (i = 0; i < n ; i++) { 
            reversedData[i] = testData[i]; 
        }
		
        for (i = 0; i < n / 2; i++) { 
            t = testData[i]; 
            reversedData[i] = testData[n - i - 1]; 
            reversedData[n - i - 1] = t; 
        } 
		return reversedData;  
    }
	
	//Shifts values of an array UP
	public static boolean shiftUp(int[] testData) { 	  
		for (int i = 0; i < testData.length - 1; ++i) {  
	    	  testData[i] = testData[i+1];	         
	    }
       
	     if (testData.length == 10){
	    	 return false;
	     } 
	     
	     return true;
    }
	
	//Shifts values of an array DOWN
	public static boolean shiftDown(int[] testData) { 	  

	       for (int i = testData.length-1; i > 0; --i) {  
	    	   testData[i] = testData[i-1];	         
	       }
       
	     if (testData.length == 10){
	    	 return false;
	     } 
	     
	     return true;
    }

	
	public static void main(String[] args) {
		   ArrayMethods app = new ArrayMethods();
		   int[] testData = { 67, 43, 1,  9, 44, 12, 66, 91, 18, 17, 4};
		   int minValue = app.findMin(testData);
		   int minIndex = app.findMinIndex(testData);
		   int[] reversedArray = app.reverse(testData);
		   boolean shiftedUpData = app.shiftUp(testData);
		   boolean shiftedDownData = app.shiftDown(testData);
		   int[] originalData = { 67, 43, 1,  9, 44, 12, 66, 91, 18, 17, 4};
		   
		   
		   
		   // call progId
		   System.out.println(ArrayMethods.progId());
		   System.out.println("");
		   
		   // call minValue
		   System.out.println("Smallest value is: " + minValue);
		   System.out.println("");
		   
		   // call minIndex
		   System.out.println("Smallest value index is: " + minIndex);
		   System.out.println("");
		   
		// Print TESTDATA
		   System.out.println("Original array is: "); 
	        for (int k = 0; k < originalData.length; k++) { 
	            System.out.print(originalData[k]+" "); }
	        System.out.println("");
	        System.out.println("");

	     
	       
		}

}
