package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_TryFinally {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("jjj.txt");
			
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} finally {
				if(fos != null) {
					fos.close();
				}
			}
			
			
		}

	}

}
