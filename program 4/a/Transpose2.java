/**
 *  Program 4a - part 2
 *  Transpose Array Programming Assignment 
 *  CS108
 *  Jun 11 2019
 *  @author  Will Rodrigues
  */

public class Transpose2 {
	
	//variables
	int array[][];
	int row;
	int col;
	
	// creates a new array, given rows and columns
	public Transpose2(int row, int col){
		this.row = row;
		this.col = col;
		array = new int[row][col];
		createPatterned2DArray();
	}
	
	//sets number of rows
	public void setRows(int row) {
		this.row = row;
	}
	
	//gets number of rows
	public int getRows() {
		return row;
	}
	
	//sets number of columns
	public void setCols(int col) {
		this.col = col;
	}
	
	//gets number of columns
	public int getCols() {
		return col;
	}

	//creates a array with the format requested
	private void createPatterned2DArray(){  
		for(int i= 0; i< array.length; ++i){
			for (int j = 0; j < array[i].length; ++j){
				array[i][j] = 10 + array.length * (i+1) + j;
			}
		}
	}

	//prints the array
	public void print2DArray(){
		if (array.length != 0){
			System.out.println(getRows() + " by " + getCols() + " matrix\n");
			for(int i = 0; i< array.length; ++i){
				for(int j = 0; j < array[i].length; ++j){
					System.out.print(array[i][j] + "  ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println();
		}
		System.out.println();
		
	}
  
	//prints the array transposed
	public void print2DArrayTransposed(){
		if (array.length != 0){
			for(int j = 0; j< array[0].length; ++j){
				for(int i = 0; i < array.length; ++i){
					System.out.print(array[i][j] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}