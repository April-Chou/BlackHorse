package test;

import java.io.File;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("D:\\");
		
		String [] arr = dir.list();
		for(String s : arr) {
			if(s.endsWith(".jpg")) {
				System.out.println(s);
			}
		}
		
		File [] subFile = dir.listFiles();
		for(File f : subFile) {
			if(f.getName().endsWith(".jpg")) {
				System.out.println("The jpg file is " + f);
			}
		}

	}

}
