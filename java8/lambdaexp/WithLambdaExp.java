package java8.lambdaexp;

interface Drawbale{
	void draw();
}


public class WithLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int height =10;
		int length = 15;
		//with lambda
		Drawable d1=()->{
			System.out.println("Drawing "+height);};
		Drawable d2=()->{System.out.println("Drawing "+length);
		};
	d1.draw();
	d2.draw();
	d1.draw();
	}

}
