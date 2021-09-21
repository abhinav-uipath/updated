package assignment.collectionArrayList;

import java.util.ArrayList;

public class ReplaceInArrayList {

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
			
			list.set(5, "Akash");//Aman Replace By Akash
			list.set(3, "Shivam");//Krishna Replace By Shivam
			list.set(6, null);//Abhi Replace By Null
			
			System.out.println("\nAfter Replace Updated Array List\n");
			for(String ArrayList:list)
				System.out.println(ArrayList);
			
			
		}
	}

}
