package inputoutput;

import java.io.FileInputStream;

public class ReadPlainTextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream plaintext = new FileInputStream("C:\\io\\New folder\\PlainTextFile.txt");
		int i;
		while ((i = plaintext.read()) != -1) {
			System.out.print((char) i);
	}

		plaintext.close();
	}}
