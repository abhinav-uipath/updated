package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAllMethodDemo {

	public static void main(String arg[]) {

		ArrayList<String> arrlist1 = new ArrayList<String>();

		arrlist1.add("Abhinav");
		arrlist1.add("Aman");

		ArrayList<String> arrlist2 = new ArrayList<String>();
		arrlist2.add("ravi");
		arrlist2.add("vicky");
		arrlist2.add("Ram");
		arrlist2.add("sham");
		arrlist2.add("balram");

		arrlist2.addAll(arrlist1);

		Iterator itr = arrlist2.iterator();
		while (itr.hasNext())
			
		{
			System.out.println("List is = " + itr.next());

		}
	}
}