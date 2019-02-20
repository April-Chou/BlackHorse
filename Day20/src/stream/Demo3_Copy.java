package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("Frank_Zane_.jpg");  
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		int b;
		
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
		
		

	}

}
