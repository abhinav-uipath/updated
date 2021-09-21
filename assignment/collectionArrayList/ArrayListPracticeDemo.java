package assignment.collectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPracticeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList<Integer> l1=new ArrayList(); creating old non-generic arraylist
		ArrayList<Integer> l1 = new ArrayList<Integer>();// creating new generic arraylist
		l1.add(23);
		l1.add(24);
		l1.add(25);
		l1.add(26);
		l1.add(27);
		l1.add(28);

		// System.out.println(l1); //Printing the arraylist object

		Iterator itr = l1.iterator();//Iterating ArrayList using Iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
