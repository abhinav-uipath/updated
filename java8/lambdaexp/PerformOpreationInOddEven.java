package java8.lambdaexp;

interface EvenOddCheck{
	int checkevenodd(int evenodd);
}

public class PerformOpreationInOddEven {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenOddCheck evenodd1 = (int evenodd)->{
			if(evenodd%2==0) {
				System.out.println(evenodd +" = is Even");
			}else {
				System.out.println(evenodd +" = is Odd");
			}
			return evenodd;
		};

		evenodd1.checkevenodd(4);
		evenodd1.checkevenodd(3);
	}
	}

