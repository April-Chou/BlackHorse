package test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Please enter the data: ");
		Scanner sc = new Scanner(System.in);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("yext.txt"));
	
		
		while(true) {
			
			String line = sc.nextLine();
			if(line.equals("quit")) {
				break;
			}
			else {
				
				bos.write(line.getBytes());
				bos.write("\rzn".getBytes());
			}
		}
		bos.close();

	}

}
