package assignment.collectionLinkedList;

import java.util.LinkedList;

public class AddElementInLinkedLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> linkedlist=new LinkedList<String>(); {
			linkedlist.add("Sonal");
			linkedlist.add("Aman");
			linkedlist.add("Abhinav");
			linkedlist.add("Raman");
			linkedlist.add("Shivam");
			linkedlist.add("Bulbul");
			linkedlist.add("Avinash");
			
			System.out.println(linkedlist);
			
			linkedlist.add(1, "Sonal Sharma");
			linkedlist.add(4, "Abhi Sharma");
			linkedlist.add(8, "Avinash Anand");
			
			System.out.println(linkedlist);
		}
	}

}
