package com.assignment06_09;

public class Shape {

	void draw() {
		System.out.println("draw in Shape");
	}
	void erase() {
		System.out.println("erase in Shape");
	}


class Circle extends Shape {
	void draw() {
		System.out.println("Draw in Circle");
	}
	void erase() {
		System.out.println("erase in Circle");
	}
}

class triangle extends Shape {
	void draw() {
		System.out.println("Draw in triangle");
	}
	void erase() {
		System.out.println("erase in triangle");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("Draw in Square");
	}
	void erase() {
		System.out.println("erase in Square");
	}
}

public static void main(String args[]){

	Square square = new Shape().new Square();
	square.draw();
	square.erase();
	Circle circle = new Shape().new Circle();
	circle.draw();
	circle.erase();
	triangle triangle = new Shape().new triangle();
	triangle.draw();
	triangle.erase();

}
}
