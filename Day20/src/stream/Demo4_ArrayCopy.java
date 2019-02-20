package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_ArrayCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("xxx.txt");
//		demo1(fis);
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		
		byte [] arr = new byte[2];
		int len;
		
		while((len = fis.read(arr)) != -1) {
			fos.write(arr,0,2);
		}
		
		
		

	}

	/**
	 * @param fis
	 * @throws IOException
	 */
	private static void demo1(FileInputStream fis) throws IOException {
		byte[] arr = new byte[2];
		
		int a = fis.read(arr);
		
		System.out.println(a);
		for(byte b : arr) {
			System.out.println(b);
		}
	}

}
