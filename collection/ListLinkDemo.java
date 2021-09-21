package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ListLinkDemo {

	public static void main(String arg[]) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Ram");
		list.add("Reena");
		list.add("Ravi");
		list.add("Rajesh");

		Iterator itr = list.iterator();

		while (itr.hasNext())
			;
		{
			System.out.println("List is = " + itr.next());
		}

	}
}
