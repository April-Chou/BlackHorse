package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * step 1 buffered reader to read file
 * step 2 jiang 将读到的字符转换成int数
 * step 3 判断是否大于0，大于0-- ，《=0则提示
 * step 4 打印出结果
 */

public class Test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		step 1
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
//		step 2
		String line = br.readLine();
		int times = Integer.parseInt(line);
		
		if(times > 0) {
			System.out.println("You have " + times-- + " chance");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(times + "");
			fw.close();
		}
		else {
			System.out.println("Time has spent. ");
		}
		
		br.close();

	}

}
