package assignment.collectionLinkedList;
 
 

import java.util.Iterator;
import java.util.LinkedList;

public class ItreateThroughAllElementInLinkedList {

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
			
			
   // Write a Java program to iterate through all elements in a linked list.
			
			
			System.out.println("ItreateThroughAllElementInLinkedList :\n");
			Iterator<String> itr=linkedlist.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
			
			
// Write a Java program to iterate through all elements in a linked list 
//starting at the specified position.
			
			//sonal and aman not print
			System.out.println("\nItreateThroughAllElementInLinkedList :\n");
			Iterator<String> itr1=linkedlist.listIterator(2);
			while(itr1.hasNext())
				System.out.println(itr1.next());
}
}}