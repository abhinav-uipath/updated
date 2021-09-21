package assignment_08_09_2021;

class Overloading {

	void sequence(int id, String name) {
		System.out.println(id + "" + name);
	}

	void sequence(String name, int id) {
		System.out.println(name + "" + id);
	}
}

public class MethodsWithDiffSequenceOfDatatypes {
	public static void main(String arg[]) {
		Overloading methods = new Overloading();
		methods.sequence(11, " Abhinav");
		methods.sequence("uday ", 9);
	}

}
