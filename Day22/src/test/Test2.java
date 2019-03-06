package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
/*
 *  xiu gai 输入输出流，开发不推荐使用
 */

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("C:\\Users\\cwx636164\\Pictures\\gorgon-foothills_4.jpg"));
		System.setOut(new PrintStream("copy.jpg"));
		
		InputStream is = System.in;
		OutputStream os = System.out;
		
		byte[] arr = new byte[1024];
		int len;
		
		while((len = is.read(arr)) != -1) {
			os.write(arr, 0, len);
		}
		
		is.close();
		os.close();

	}

}
