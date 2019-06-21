/**
 *  Program 7a
 *  MyArrayList program
 *  CS108
 *  Jun 20 2019
 *  @author  Will Rodrigues
*/

public class MyArrayList<E> extends MyAbstractList<E> implements MyList<E> {
	
	//Arrays, variables and constants
	protected static final int INITIAL_CAPACITY = 10;
	E[] array;
	E[] newArray;
	
	//creates the array with default initial size
	@SuppressWarnings("unchecked")
	public MyArrayList() {
		array = (E[]) new Object[INITIAL_CAPACITY];
	}

	//creates the array with given initial size
	@SuppressWarnings("unchecked")
	public MyArrayList(int initialCapacity) {
		super();
		array = (E[]) new Object[initialCapacity];
		size = 0;
	}

	//Appends the specified Object to the end of this list
	@Override
	public boolean add(E data) {
		if (data != null) {
			if (size == this.array.length) {
				this.resize();
			}
			this.array[size] = data;
			size = size + 1;
		}
		return true;
	}
	
	//check if the array is empty
	@Override
	public boolean isEmpty() {
		if(size==0)
			return true;
		else
			return false;
	}
	
	//Appends the specified Object to the list at the specified index
	@SuppressWarnings("unchecked")
	@Override
	public boolean add(int index, E data) {
		newArray = (E[]) new Object[this.array.length+1];
		
		for (int i = 0; i < this.array.length; i++) {
			newArray[i] = array[i];
		}
		newArray[index] = data;
		for (int i = index; i < this.array.length; i++) {
			newArray[i+1] = array[i];
		}		

		array = newArray;
		size = size + 1;
		return false;
	}

	//Returns true if this list contains the specified Object
	@Override
	public boolean contains(Object data) {
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] == data)
				return true;
		}
		return false;
	}

	//Returns the Object at the specified position in this list
	@Override
	public E get(int index) throws Exception {
			for (int i = 0; i < this.array.length; i++) {
				if (i == index)
					return this.array[i];
			}
		return null;
	}

	//Returns the Object at the specified position in this list and deletes it
	//from the list
	@Override
	public E remove(int index) throws Exception {
		if(index<0 || index>size())
			throw new IndexOutOfBoundsException();
		E element = this.array[index]; 
		for(int i = index; i < this.array.length - 1; i++){
			this.array[i] = this.array[i+1];
        }
		size = size - 1;
		return element;
	}

	//Returns the index of the first occurrence of the specified Object in this
		//list, or -1 if this list does not contain the Object
	@Override
	public int indexOf(E data) {
		if (data != null){
			for (int i = 0; i <= this.array.length - 1 ; i++){
				if (data.equals(this.array[i])){
					return i;
				}
			}
		}
		return -1;
	}
	
	//print the array
	@Override
	public String toString() {
		String s = "[";
		if (!isEmpty()) {
			for (int i=0; i< size-1; i++)
				s += array[i] + ", ";
			s += array[size-1];
		}
		return s += "]";
	}

	//Grow array if it is too short
	private void resize() {
		try {
			this.array = this.doubleArraySizeAndCopy();
		} catch (OutOfMemoryError e) {
			e.printStackTrace();
		}
	}

	//Double size and copy elements.  
	@SuppressWarnings("unchecked")
	private E[] doubleArraySizeAndCopy() {
		E[] temp = (E[]) new Object[this.array.length * 2];
		for (int i = 0; i < this.array.length; i++) {
			temp[i] = this.array[i];
		}
		return temp;
	}
	
	//return the program string id
	public static String progId() 
    {
		String progId = "7a";
        String sName = "Will Rodrigues";
		return "Program " + progId + ", " + sName;	
    }
	
	
//	/*KEPT FOR FUTURE REFERENCE*/
//	private boolean checkRange(int index) throws Exception {
//		if (index < 0)
//			throw new IllegalArgumentException("Index cannot be negative");
//		if (index >= this.size)
//			throw new IndexOutOfBoundsException(
//					"Cannot access " + index + " element");
//		return true;
//	}
	
//	/*KEPT FOR FUTURE REFERENCE*/
//	//Trims the capacity of this instance to be the list's current size. An
//		//application can use this operation to minimize the storage of an instance.
//	@Override
//	public void trimToSize() {
//		// ToDo
//		// make array just this size
//		// copy elements into it
//		// list = newArray;
//		
//	}
	
//	/*KEPT FOR FUTURE REFERENCE*/
//	//Let the garbage collector do the heavy lifting!
//	// @SuppressWarnings("unchecked")
//	public void clear() {
//		//ToDo
//	}
//
}