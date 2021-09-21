package java8.lambdaexp;

interface Sayable1{
	public String say(String name);
	
}

public class OneParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayable1 s1 =(name)->("my name is "+name); //WITHOUT RETURN
			//System.out.println("my name is "+name);
			//return "My name is"+name;
			//return name;
			
		
		Sayable1 s2 =(name)->{ //WITH RETURN
			System.out.println("my name is "+name);
			//return "My name is "+name;
			return name;
		};
	System.out.println(s1.say("Abhinav"));
	s2.say("Abhi");
	
	}

}
