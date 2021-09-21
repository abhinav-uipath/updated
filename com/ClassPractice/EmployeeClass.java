package com.ClassPractice;

public class EmployeeClass {//custom class
 
	int id;
	String name;
	
	void persondetails() {
		System.out.println("my id is "+id);
		System.out.println("My name is "+name);
		 
	}
	public static void main (String arg[])
	{
		
	EmployeeClass obj=new EmployeeClass();
	//obj.persondetails();
	
	obj.id=1;
	obj.name="Abhinav Sharma";
	
	//System.out.println(obj.id);
	//System.out.println(obj.name);
	obj.persondetails();
	
	}
}
