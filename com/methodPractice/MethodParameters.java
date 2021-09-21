package com.methodPractice;

public class MethodParameters {
	int MYSum(int x, int y) {//here (int x , int y) is parameters
		int z = x + y;
		System.out.println("z = "+ z);
		return z;
	}
	
	void Myname(String Name , String Address,String MobileNumber) {
	System.out.println("Name = "+Name+"\n"+"Address = "+Address+"\n"+"User Mobile Number = "+MobileNumber);
	}
	public static void main (String arg[]) {
		MethodParameters methodparameters = new MethodParameters();
				methodparameters.MYSum(5, 7); // (5,7) is Arguments
				methodparameters.MYSum(22,33);
				methodparameters.MYSum(34,34);
				
				
				//MethodParameters methodparameters1 = new MethodParameters();
				methodparameters.Myname("Abhinav Sharma", "Bulandshahr", "848484848");
	}
}
