package inputoutput;

//Write a Java program to read contents from a file into byte array. 


import java.io.ByteArrayInputStream;

public class ReadByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
			    byte[] buf = { 21, 22, 23, 24 };  
			    // Create the new byte array input stream  
			    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
			    int k = 0;  
			    while ((k = byt.read()) != -1) {  
			      //Conversion of a byte into character  
			      char ch = (char) k;  
			      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
			    }  
			  }  
	}


