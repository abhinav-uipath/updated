package inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fin = new FileInputStream("C:\\io\\aman.txt");
		BufferedInputStream bin =new BufferedInputStream(fin);
		
		int i;
		while ((i=fin.read())!=-1) {
			System.out.print((char)i);
		}
		fin.close();
		bin.close();
	}

}
