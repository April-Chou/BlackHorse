package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("yyy.txt");//shu chu输出流创建字节输出流对象，如果没有就自动创建一个
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		fos.close();  //sui 虽然写出的是一个int数，但是到文件上的是一个字节，会自动去除前三个八位

	}

}
