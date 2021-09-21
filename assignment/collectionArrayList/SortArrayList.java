package assignment.collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String arg[]) {
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	{
		arraylist.add(45);
		arraylist.add(67);
		arraylist.add(56);
		arraylist.add(43);

		Collections.sort(arraylist);

		for (int Number : arraylist) {
			System.out.println(Number + "");
		}
		System.out.println("\n");

		ArrayList<String> arraylist1 = new ArrayList<String>();
		{
			arraylist1.add("Aman");
			arraylist1.add("vivek");
			arraylist1.add("Joy");
			arraylist1.add("Anurag");
			arraylist1.add("Rocky");

			Collections.sort(arraylist1);

			for (String ListOfName : arraylist1) {
				System.out.println(ListOfName);
			}
		}
	}

}}
