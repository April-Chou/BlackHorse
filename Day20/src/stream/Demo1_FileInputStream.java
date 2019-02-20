package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("xxx.txt");
		
		int x ;
		
		while((x = fis.read()) != -1) {
			
			System.out.println(x);
			
		}
		fis.close();
		
		
		
		

	}
 
}
