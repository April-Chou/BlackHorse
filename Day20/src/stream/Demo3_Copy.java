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
		
		//demo1(fis, fos);
		/*
		 * 开发中不用available， 因为可能内存溢出，单个读和写也不考虑，因为效率低
		 */
		

	}

	/**
	 * @param fis
	 * @param fos
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static void demo1(FileInputStream fis, FileOutputStream fos) throws IOException {
		int b;
		
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}
