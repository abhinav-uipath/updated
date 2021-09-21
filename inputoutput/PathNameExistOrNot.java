package inputoutput;

//Write a Java program to check if a file or directory specified by pathname exists or not. 

import java.io.FileInputStream;

public class PathNameExistOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream in = new FileInputStream("C:\\io\\amana.txt");//wrong file path
			System.out.println("FilePathName is Exist :");
			int i;
			while ((i = in.read()) != -1) {
				System.out.print((char) i);
			}
			in.close();
		} catch (Exception e) {
			System.out.println("FilePathName is Not Exist");

		}

	}
}