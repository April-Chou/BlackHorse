package test;

import java.io.File;
import java.util.Scanner;

/*
 * cong jianpan luru dayin 
 */
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = getDir();
		System.out.println(dir);
		printJavaFile(dir);
		

	}
	
// get the directory	
	public static File getDir() {
//		scanner to get the keyboard in.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file directory: ");
		
		
		
//      get the system in into String and make it a file
		
		
//		using if to decide where2go and file loop
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			
			if(!dir.exists()) {
				System.out.println("What you entered is not exist, please retry again: ");
			}
			
			else if(dir.isFile()) {
				System.out.println("What you entered is a file, please enter a directory: ");
				
			}
			else {
				sc.close();
				return dir;
			}
		}
		
	}
	
//	get each file and using if
	public static void printJavaFile(File dir) {
		File [] subFiles = dir.listFiles();
//		use for each to see
		for(File subFile : subFiles) {
			if(subFile.isDirectory()) {
				printJavaFile(subFile);
			}
			else {
//				see if it end with .java or not
				if(subFile.getName().endsWith(".java")) {
					System.out.println("Java File is: " + subFile);
				}
			}
		}
	}

}
