package assignment.collectionArrayList;


//Write a Java program to reverse elements in a array list.

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElementInArrayList {

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
			
			Collections.reverse(list);//method of reverse string
			System.out.println("\nReverseArrayList \n");
			for(String ArrayList:list)
				System.out.println(ArrayList);// Print Reverse ArrayList
			
			
			
	}

}}
