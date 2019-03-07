package test;

import java.io.File;

/*
 * BE CAREFUL, THIS JAVA FILE IS ABOUT TO DELETE THE DIRECTORY WHICH YOU ENTER.
 * cong 从键盘接受一个文件夹路径，删除该文件夹
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What you will do is to delete the file, please be careful....");
		deleteFile(Test1.getFile());

	}
	
	public static void deleteFile(File file) {	
		File[] subFiles = file.listFiles();
//		bian li
		for(File subFile : subFiles) {
			if(subFile.isFile()) {
				subFile.delete();
				System.out.println(subFile + " has been deleted.");
			}
			else {
				deleteFile(subFile);
			}
		}
	}

}
