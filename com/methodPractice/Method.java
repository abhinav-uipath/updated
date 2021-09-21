package com.methodPractice;

public class Method {
	

	 void MyMethod() {
		System.out.println("My name is Abhinav");//This is a Static Method
	}
	public  void MyMethod1() {
		System.out.println("My name is Abhinav Sharma");//This is a public Method
		
	}
	
	public int sum() {
	int a=2;
	int b=3;
	int c=a+b;
	System.out.println(c);
	return c;
	
	}
	
	public static void main (String arg[]) {  
		
		//MyMethod();// In static method you call directly without creating any object
		
		Method obj3=new Method();// but in public method first you create object and after call
		obj3.MyMethod1();
		
		Method obj=new Method();// but in public method first you create object and after call
				obj.MyMethod1();
				
		Method obj1=new Method();
		      obj1.sum();

	}
}
