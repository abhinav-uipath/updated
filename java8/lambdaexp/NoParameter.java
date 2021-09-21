package java8.lambdaexp;

interface sayable{
	String say();
}

public class NoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayable s=()->{
			return("Welcome , In Java Programming");
		};
		System.out.println(s.say());
	
	}
	

}
