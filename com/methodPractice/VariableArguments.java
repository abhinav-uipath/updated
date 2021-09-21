package com.methodPractice;


//IT IS KNOWN AS VARIABLE ARGUMENTS OR VARARGS.....

public class VariableArguments {
	
	int SumArr(int...arr) {
		int result=0;
		for (int a:arr) {// USE FOREACH LOOP[for(data_type variable : array)
		 result +=a;
		}
		return result;//RETURN TYPE INT
	}

	public static void main(String args[]) {
	//	System.out.println("SumOfArray "+(SumArr(2,3,4,5,6))); // FOR USE STATIC METHOD
		VariableArguments variablearguments = new VariableArguments();// CREATE OBJECT
		
		System.out.println(variablearguments.SumArr(2,3,4,5));//CALL METHOD BY OBJECT AND 
																	//GIVIND A PERAMETERS
	}
}
