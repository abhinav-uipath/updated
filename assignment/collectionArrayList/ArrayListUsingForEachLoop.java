package assignment.collectionArrayList;

import java.util.ArrayList;

public class ArrayListUsingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		{
			arraylist.add(45);
			arraylist.add(67);
			arraylist.add(56);
			arraylist.add(43);

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

				for (String ListOfName : arraylist1) {
					System.out.println(ListOfName);
				}
			}
		}
		int SizeOfArraylist = arraylist.size();
		System.out.println("SizeOfArraylist = " + SizeOfArraylist);
	}

}
