package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkList {

	public static void main(String arg[]) {
		
		//merging of two arrays..
		List<String> list=new LinkedList<String>();
		
		
		list.add("jack");
		list.add("Rock");
		
		ArrayList<String> arrlist=new ArrayList<String>();
		arrlist.add("Aman");
		arrlist.add("Abhinav");
		arrlist.add("ram");
		
		arrlist.addAll(list);
		Iterator itr = arrlist.iterator();
		
		while(itr.hasNext())
		
		{
		
		System.out.println("List Is = "+itr.next());
		}
	}
	}

