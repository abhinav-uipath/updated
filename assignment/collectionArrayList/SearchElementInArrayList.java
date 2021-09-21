package assignment.collectionArrayList;

import java.util.ArrayList;

public class SearchElementInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();{
			list.add("Ram");
			list.add("shyam");
			list.add("Balram");
			list.add("Krishna");
			list.add("Lakhan");
			list.add("Aman");
			list.add("Abhi");
			list.add("Abhinav");
			
			System.out.println("ArrayList \n");
			for(String ArrayList:list)
				System.out.println(ArrayList);// Print ArrayList
			
		int IndexOf = list.indexOf("Abhinav");
			System.out.println("\nIndexOfInArrayList: \n");
			//for(String ArrayList:list)
				System.out.println(IndexOf);
				if(IndexOf==-1) 
					System.out.println("This String Is Not In List");
				else
					System.out.println("This String Is In List");
			
	}
	}
}
