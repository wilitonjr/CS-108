/**
 *  Program 7a
 *  MyArrayList program
 *  CS108
 *  Jun 20 2019
 *  @author  Will Rodrigues
*/

public interface MyList<E> {

	//Appends the specified Object to the end of this list
	boolean add(E data);

	//Appends the specified Object to the list at the specified index
	boolean add(int index, E data);

	//Returns true if this list contains the specified Object
	boolean contains(E data);

	//Returns the Object at the specified position in this list
	E get(int index) throws Exception;

	//Returns the Object at the specified position in this list and deletes it
	  //from the list
	E remove(int index) throws Exception;

	//Returns the index of the first occurrence of the specified Object in this
		//list, or -1 if this list does not contain the Object
	int indexOf(E data);

	//Returns true if this list contains no Objects
	boolean isEmpty();

	//Returns the number of Objects in this list
	int size();
	
	
//	/*KEPT FOR FUTURE REFERENCE*/
//	//Trims the capacity of this instance to be the list's current size. An
//		//application can use this operation to minimize the storage of an instance.
//	void trimToSize();
//	//Removes all of the Objects from this list
//	void clear();

}
