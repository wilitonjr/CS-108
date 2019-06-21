/**
 *  Program 7a
 *  MyArrayList program
 *  CS108
 *  Jun 20 2019
 *  @author  Will Rodrigues
*/

public abstract class MyAbstractList<E> implements MyList<E> {

	protected int size;
	

	
	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public int size() {
		return this.size;
	}
	
//	/*KEPT FOR FUTURE REFERENCE*/
//	public MyAbstractList() {
//	}
}
