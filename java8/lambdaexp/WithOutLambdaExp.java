package java8.lambdaexp;

interface Drawable {
	void draw();
}

public class WithOutLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int width=10;
		Drawable d = new Drawable(){
			public void draw() {
				System.out.println("Drawing "+width);
			}
		};
		
		d.draw();
	}

}
