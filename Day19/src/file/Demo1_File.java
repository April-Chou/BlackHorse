package file;

import java.io.File;
import java.io.FileInputStream;

public class Demo1_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
//		demo2();
		File parent = new File("D:\\\\\\\\White Board");
		String child = "abc.txt";
		File file = new File(parent, child);
		System.out.println(file.exists());
		System.out.println(parent.exists());

	}

	/**
	 * 
	 */
	private static void demo2() {
		String parent = "D:\\\\White Board";
		String child = "abc.txt";
		File file = new File(parent, child);
		System.out.println(file.exists());
	}

	/**
	 * 
	 */
	private static void demo1() {
		File file = new File("D:\\White Board");
		file.exists();
		System.out.println(file.exists());
		File file2 = new File("abc.txt");
		System.out.println(file2.exists());
	}

}
