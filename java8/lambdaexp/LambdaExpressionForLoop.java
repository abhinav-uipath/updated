package java8.lambdaexp;

import java.util.ArrayList;

public class LambdaExpressionForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
			list.add("Abhinav");
			list.add("Aman");
			list.add("Avinash");
			list.add("Raman");
			list.add("Abhi");
			
			list.forEach((n)->System.out.println(n));
		
		
	}

}
