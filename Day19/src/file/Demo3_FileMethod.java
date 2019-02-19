package file;

import java.io.File;
import java.io.IOException;

public class Demo3_FileMethod {

	public static void main(String[] args) throws IOException {
		//demo2();
		File file = new File("yyy.txt");
		System.out.println(file.delete());
		
		File file2 = new File("aaa");
		System.out.println(file2.delete());
		
		File file3 = new File("ccc");
		System.out.println(file3.delete());

	}

	/**
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static void demo2() throws IOException {
		// TODO Auto-generated method stub
		File file = new File("xxx.txt");
		file.createNewFile();
		System.out.println(file.exists());
		File file2 = new File("ooo.txt");
		
		System.out.println(file.renameTo(file2));
	}

}
