package file;

import java.io.File;
/*
 * windows 系统认为一切文件都是可读的
 */

public class Demo4_FileMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		File file = new File("zzz");
		
		System.out.println(file.setWritable(false));
		System.out.println(file.canWrite());
		
		
		

	}

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static void demo1() {
		File dir1 = new File("ccc");
		System.out.println(dir1.isDirectory());
		
		File dir2 = new File("zzz");
		System.out.println(dir2.isFile());
		
		System.out.println(dir1.isFile());
	}

}
