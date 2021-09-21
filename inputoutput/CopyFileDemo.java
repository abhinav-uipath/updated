package inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


        FileReader in = null;
        FileWriter out = null;
		
		try {
        in = new FileReader("C:\\io\\aman.txt");
        out = new FileWriter("C:\\io\\abhi.txt");
        
        int i;
        while ((i=in.read())!=-1) {
        	out.write(i);
        }
        System.out.println("Done...");
        
	}catch (Exception e)
		{ e.printStackTrace();
		}
		finally{
			in.close();
			out.close();
		}
	}
}
