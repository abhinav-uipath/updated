package assignment.collectionArrayList;

import java.util.ArrayList;

public class AddElementInArrayList {

	public static void main(String arg[]) {
		ArrayList<String> list = new ArrayList<String>();
		{
			list.add("Ram");
			list.add("Raman");
			list.add("Abhinav");
			list.add("Aman");
			list.add("Avinash");

			System.out.println("ArrayList: \n");
			for (String ArrayList : list) {
				System.out.println( ArrayList);
			}
			
			list.add(0, "Prakash");//ADD ELEMENT IN ARRAYLIST
			list.add(3, null);
			
			System.out.println("\n" + "UpdateArrayList: ");//PRINT UPDATE ARRAY LIST

			for (String UpdateArrayList : list) {
				System.out.println(UpdateArrayList);
			}
		}
	}
}