package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String arg[]) {
		List<String> fruitlist = new ArrayList<String>();
		fruitlist.add("Apple");
		fruitlist.add("Banana");
		fruitlist.add("mango");
		
	    //enhanced for loop specially used iterating objects on collection frame work
        for (String friutsloop : fruitlist) {
 
            System.out.println(" list of  friuit " + friutsloop);
	}
}
} 