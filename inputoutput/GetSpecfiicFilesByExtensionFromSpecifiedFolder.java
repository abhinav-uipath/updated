package inputoutput;

//Write a Java program to get specific files by extensions from a specified folder. 


import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class GetSpecfiicFilesByExtensionFromSpecifiedFolder {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fileinputstream1 = new FileInputStream("C:\\io\\aman.txt");
		// GetSpecfiicFilesByExtensionFromSpecifiedFolder
		FileInputStream fileinputstream2 = new FileInputStream("C:\\io\\New folder\\Data.txt");
		// GetSpecfiicFilesByExtensionFromSpecifiedFolder

		SequenceInputStream inst = new SequenceInputStream(fileinputstream1, fileinputstream2);

		int i;
		while ((i = inst.read()) != -1) {
			System.out.print((char) i);

		}
		fileinputstream1.close();
		fileinputstream2.close();
		inst.close();
	}
}