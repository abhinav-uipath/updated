package java8.lambdaexp;

interface Addable{
	int add(int a ,int b);
}

public class MultipleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addable Add1 = (a,b)->(a+b); //with out return
		
		Addable Add2 = (int a,int b)->{
			return a+b;// with return value
		};
		System.out.println("Sum Of Two Number = "+Add1.add(3, 3));
		System.out.println("Total = "+Add2.add(10, 12));
		
		
	}

}
