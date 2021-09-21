package assignment.collectionArrayList;

import java.util.ArrayList;

public class RemoveElementInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>(); {
			list.add("Ravi");
			list.add("Pratap");
			list.add("Kumar");
			list.add("vivek");
			list.add("kailash");
			list.add("Rajnish");
			list.add("Salman");
			list.add("Suraj");
			
			
			System.out.println("ArrayList \n");
			for(String ArrayList:list) {
				System.out.println(ArrayList); }
			
		
			list.remove(1);// means remove Pratap 
			list.remove(3);// means remove vivek
		    list.remove(5);// means remove suraj
			
			System.out.println("\nAfter Remove Element in ArrayList \n");
			for (String ArrayList:list) {
				System.out.println(ArrayList);
			}
		}
	}

}
