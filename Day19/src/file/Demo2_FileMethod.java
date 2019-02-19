package file;

import java.io.File;
import java.io.IOException;

public class Demo2_FileMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//demo1();
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
		
		File dir2 = new File("bbb.txt");
		System.out.println(dir2.mkdir());
		
		File dir3 =new File("ccc\\ddd");
		System.out.println(dir3.mkdirs());
		

	}

	/**
	 * @throws IOException
	 */
	private static void demo1() throws IOException {
		File file = new File("yyy.txt");
		System.out.println(file.createNewFile());// ru 如果没有就创建，返回true， 
		File file2 = new File("zzz");
		System.out.println(file2.createNewFile());
	}

}
