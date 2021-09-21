package assignment_08_09_2021;

class Student{
	int id;
	String name;
	int age ;
	
	// creating constructor
	Student (int i , String n) {
	 id = i;
	 name = n;
	}	
	 // creating 3 argument constructor
	 Student (int i , String n , int a){
		 id = i;
		 name = n;
		 age = a;
	 }
	 void display() {
	  System.out.println(id+""+name+""+age);
}
}
public class ConstructorOverloading {
public static void main(String arg[]) {
	
	Student student1 = new Student(111, " Abhinav");
	Student student2 = new Student(12, " Sahil ", 39);
	student1.display();
	student2.display();
}
}
