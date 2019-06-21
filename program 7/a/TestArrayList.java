/* Sample test driver for MyArrayList.
 * 
 * During development, you can comment out methods not
 * yet written, or let them fail.  Once they start passing,
 * you can move on to implement another piece.
 * 
 * Feel free to add your own tests. This file will not be 
 * turned in for grading.
 */
public class TestArrayList {

	public static void main(String[] args) throws Exception {
		MyArrayList<Integer> iList = new MyArrayList<>();
		iList.add(100);
		iList.add(200);
		iList.add(300);
		iList.add(400);
		iList.add(500);
		iList.add(600);
		iList.add(700);
		iList.add(800);
		iList.add(900);
		iList.add(1000);
		iList.add(1100);
		System.out.println(iList);
		System.out.println("");	
		iList.add(1,150);
		System.out.println(iList);
		System.out.println("");	
		iList.remove(3);
		System.out.println(iList);
		System.out.println("index: " + iList.indexOf(300));
		
		
//		MyArrayList sList = new MyArrayList();
//		sList.add("This");
//		sList.add("list");
//		sList.add("is my own creation");
//		System.out.println(sList);
//		System.out.println("");	
//		
//		sList.add(1,"excellent");
//		System.out.println(sList);	
//		System.out.println("");	
////
		MyArrayList dList = new MyArrayList(3);
//		System.out.println(dList); // empty list
		
		dList.add(1.0);
		dList.add(2.0);
		dList.add(3.0); // List is full
		dList.add(4.0); // resized list
		//System.out.println(dList);  
		
//		try {
//			dList.remove(0);  // works
//			System.out.println(dList.size());
//			System.out.println(dList); 
//			dList.remove(4);  // now out of range
//			System.out.println(dList.size());
//			System.out.println(dList); 
//		}
//		catch (Exception e){
//			System.out.println("Can't remove this element");
//		}
//		dList.trimToSize();
//
//		/* Put all the objects in one list.
//		 * Cannot do this test with MyArrayList<E> because (doh!)
//		 *    the type is limited to the parameter E.
//		 */
//		MyArrayList all = new MyArrayList();
//		try {
//		for (int i = -0; i < iList.size(); i++)
//			all.add(iList.get(i));
//		for (int i = 0; i < sList.size(); i++)
//			all.add(sList.get(i));
//		for (int i = 0; i < dList.size(); i++)
//			all.add(dList.get(i));
//		}
//		catch (Exception e) {
//			System.out.println("Get failed");
//		}
//		for (int n = 50; n <= 250; n+=50){
//			if (all.contains(n))
//				System.out.println("Item " + n + " at index " + all.indexOf(n));
//			else
//				System.out.println("Item " + n + " not in list");
//		}
//		System.out.println(all);  
//		all.clear();
//		System.out.println(all);
	}

}
