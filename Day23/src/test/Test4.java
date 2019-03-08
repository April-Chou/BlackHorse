package test;

import java.io.File;

/*
 * cong 从键盘接受一个文件夹路径，把文件夹中所有的文件及文件夹名字按层级打印
 * 1. 获取所有的文件和文件夹，返回file数组
 * 2. 遍历数组
 * 3. 无论是文件夹还是文件都需要直接打印。
 * 4. 如果是文件夹，递归调用
 */
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = Test1.getFile();
		printDir(file,0);

	}
	
	public static void printDir(File file, int lev) {
//		step 1
		File [] subFiles = file.listFiles();
//		Step 2
		for(File subFile : subFiles) {
//      kong 控制打印的\t 
			for(int i=0; i<=lev; i++) {
				System.out.print("\t");
			}
//			print anyway
			System.out.println(subFile);
		
//			print Directory
			if(subFile.isDirectory()) {
				printDir(subFile,lev+1);
			}
		}
	}

}
