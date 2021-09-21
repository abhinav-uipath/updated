package inputoutput;

//Write a Java program to get a list of all file/directory names from the given.

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ListOfAllDirectoryName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		FileInputStream fin = new FileInputStream("C:\\io\\ListOfAllDirectoryName.txt");
		BufferedInputStream bin =new BufferedInputStream(fin);
		
		int i;
		while ((i=fin.read())!=-1) {
			System.out.print((char)i);
		}
		fin.close();
		bin.close();
	}
	}


