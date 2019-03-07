package test;

import java.io.File;
import java.util.Scanner;

/*
 * CONG 从键盘接受一个文件夹路径，统计文件夹大小
// * fenxi：
 *     1. 从键盘接受一个文件夹路径
 *     2. 判断接受的字符串是否是文件夹
 *     2.1 可能是乱码， 返回要求重新输入（用isDirectory//isFile）
// *     
// * tong 统计文件夹大小
 *     1. 定义一个求和变量
 *     2. 获取该文件夹下所有的文件和文件夹
 *     3. 遍历数组
 *     4. 判断文件就计算大小并累加
 *     5. 判断是文件夹，递归调用
 * 
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumFile(getFile());

	}
	
	public static File getFile() {
		System.out.println("Please enter a file/directory: ");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists()) {
				System.out.println("What you entered is not exist, please re-enter again: ");
			}
			else if(file.isFile()) {
				System.out.println("What you entered is a file, Please re-enter: ");
			}
			else {
				
				return file;
			}
		}
		
	}
	
	public static void sumFile(File file) {
//		step2.1
		long totalFile = 0;
//		step 2.2
		File [] subFiles = file.listFiles();
//		step 2.3
		for(File subFile : subFiles) {
			if(subFile.isFile()) {
				totalFile++;
				System.out.println(subFile + ": " + subFile.length());
				
			}
			
			else {
				sumFile(subFile);
			}
		}
		System.out.println("Total File number is " + totalFile);
		
	}

}
