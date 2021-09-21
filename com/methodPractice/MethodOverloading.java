package com.methodPractice;

public class MethodOverloading {

	int MYSum(int x, int y) {
		int z = x + y;
		System.out.println("z = "+ z);
		return z;
	}
	
	int Mysum(int x,int y, int z) {
		if(x>=y) {
			int sum=x+y+z;
			System.out.println("Sum = "+sum);
			return sum;
		}
		else {
			int product=x*y*z;
		System.out.println("Product = "+product);
		return product;
			
		}
	}
	public static void main (String arg[]) {
		MethodOverloading methodoverloading = new MethodOverloading();
		methodoverloading.MYSum(25,50);
		methodoverloading.Mysum(2, 3, 1);
		methodoverloading.Mysum(3, 2, 5);
	}
}
