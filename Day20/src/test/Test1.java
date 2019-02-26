package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Frank_Zane_.jpg"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copye.jpg"));
				){int b;
				while ((b = bis.read()) != -1) {
					bos.write(b ^ 123);
					//123 wei key
				}
			
		}
		
		
		

	}

}
