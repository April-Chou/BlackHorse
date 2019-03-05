package other;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2_ByteArrayOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("ronnie.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int b;
		while((b = fis.read()) != -1) {
			baos.write(b);
		}
		
		fis.close();
		baos.close();
//		byte [] arr = baos.toByteArray();
//		System.out.println(new String(arr)); // jiang 将缓冲区内容转换成字符串
		
		System.out.println(baos); // ci 出使用平台默认编码表
		

	}

}
