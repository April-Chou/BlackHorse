package test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("ronnie.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte [] arr = new byte[5];
		int len;
		while((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
		}
		System.out.println(baos);
		fis.close();
		baos.close();
		
		

	}

}
