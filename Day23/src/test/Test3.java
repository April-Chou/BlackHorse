package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * cong 键盘接受两个文件夹路径，把其中一个文件夹中（包括内容）拷贝到另一个文件夹中。
// * 1. 把其中一个文件夹中， 包括内容拷贝到另一个文件夹
 *   1.1  在目标文件夹中创建原文件夹
 *   1.2 获取原文件夹中所有的文件和文件夹，
 *   1.3 存储到数组中
 *   1.4， 遍历数组
 *   1.5 如果是文件，就读写，文件夹就递归调用
 */
public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = Test1.getFile();
		System.out.println("...........");
		File dest = Test1.getFile();
		if(src.equals(dest)) {
			System.out.println("Already exist");
		}else {
			copyDir(src,dest);
		}
		

	}
	
	public static void copyDir(File source, File copy) throws IOException {
		File newDir = new File(copy, source.getName());
		newDir.mkdir();
//		step1.2, step 1.3
		File [] subFiles = source.listFiles();
//		step 1.4
		
		for(File subFile : subFiles) {
			
//			step 1.5
			if(subFile.isFile()) {
				FileInputStream fis = new FileInputStream(subFile);
				FileOutputStream fos = new FileOutputStream(new File(newDir, subFile.getName()));
				int b;
				while((b = fis.read()) != -1) {
					fos.write(b);
				}
				fis.close();
				fos.close();
			}
			else {
				copyDir(subFile, newDir);
			}
		}
	}

}
