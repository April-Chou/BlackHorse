package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = getFile();
		
		try(
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
				) {
			int b;
			while((b = bis.read()) != -1) {
				bos.write(b);
			}
		}
		

	}
	
	/*
	 * dingyi fangfa huoqu wenjian lujing, fengzhuangcheng File
	 */
	public static File getFile() {
		System.out.println("Please enter the file path: ");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			
			if(! file.exists()) {
				System.out.println("File doesn`t exist, please eneter again: ");
			}
			else if (file.isDirectory()) {
				System.out.println("What you entered is a directory, please enter again: ");
			}
			else {
				return file;
			}
		}
	}

}
