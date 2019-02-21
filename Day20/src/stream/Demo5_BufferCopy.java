package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * nei 内存的运算效率要比硬盘高， 所以只要降低硬盘的读写次数就会提高效率
 * kai 开发中可以小数组也可以buffered
 */
public class Demo5_BufferCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\Github_Repository\\Day20\\test1234.docx");
		FileOutputStream fos = new FileOutputStream("copy.docx");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();

	}

}
