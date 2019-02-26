package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6_Chinese {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demo();
		FileOutputStream fos = new FileOutputStream("www.txt");
		fos.write("小郭姐姐".getBytes());
		fos.close();

	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void demo() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("zzz.txt");
		byte [] arr = new byte[3];
		int len ;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr,0,len));
		}
		
		fis.close();
	}

}
