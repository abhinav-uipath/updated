package inputoutput;

import java.io.FileInputStream;


//READ SINGLE CHARACTER



public class FileInputStreamDemo {
 
	public static void main(String arg[]) {
		
		try {
			FileInputStream in = new FileInputStream("C:\\io\\aman.txt");
			int i=in.read();
			System.out.println((char)i);
			
			in.close();
		}catch(Exception e) {
				System.out.println(e);
			
		}
	}
}
