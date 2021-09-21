package collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {

	public static void main(String arg[]) {
		
		ArrayList<String> arrlist=new ArrayList<>();
		
		arrlist.add("Abhinav");
		arrlist.add("Aman");
		arrlist.add("Abhi");
		arrlist.add("Avinash");
		arrlist.add("vivek");
		Iterator itr = arrlist.iterator();

		while (itr.hasNext()) {

			System.out.println("list is " + itr.next());

		}
		
	}
}
