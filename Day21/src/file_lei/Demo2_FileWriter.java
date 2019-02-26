package file_lei;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("yyy.txt",true);
		fw.write("Go on, continue, carry on");
		
		fw.close();

	}

}
