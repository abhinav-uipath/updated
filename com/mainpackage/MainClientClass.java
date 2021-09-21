package com.mainpackage; 

import com.addition.AdditionServiceClass;
import com.evenoddclass.EvenOddServiceClass;
import com.multiplication.MultiplicationServiceClass;
import com.substraction.SubstractionServiceClass;

public class MainClientClass {

	public static void main (String arg[]) {
	AdditionServiceClass additionserviceclass = new AdditionServiceClass();

	additionserviceclass.SumOfNumber(45, 450);
	
	SubstractionServiceClass substractionserviceclass = new SubstractionServiceClass();
	substractionserviceclass.SubOfNumber(405, 45);

	MultiplicationServiceClass multiplicationserviceclass =new MultiplicationServiceClass();
	multiplicationserviceclass.ProductOfNumber(25, 5);
	
	EvenOddServiceClass evenoddserviceclass = new EvenOddServiceClass();
	evenoddserviceclass.EvenOrOdd(5655);
}
}	
	