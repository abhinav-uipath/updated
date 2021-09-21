package assignment_08_09_2021;


abstract class A{
	abstract void show();
}
	class B extends A{
		void show() {
		System.out.println(" Call Me B ");
	}
	
	}
public class AbstractClass {
	
	public static void main (String arg[]) {
		B b = new B();
		b.show();
}
}
