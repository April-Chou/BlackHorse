package file_lei;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4_Buffered {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			/*
			 * newline 是跨平台的方法，\r \n只支持Windows系统
			 */
		}
		
		br.close();
		bw.close();
		

	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		String line;
		
		/*
		 * geng 更高效的读取，整行整行读取
		 */
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
