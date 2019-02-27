package file_lei;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo7_TransIO {

	public static void main(String[] args) throws IOException {
		//demo1();
		
		InputStreamReader irs = new InputStreamReader(new FileInputStream("utf-8.txt"),"utf-8");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");
		
		int c;
		while((c = irs.read()) != -1) {
			osw.write(c);
		}
		
		irs.close();
		osw.close();
		

	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static void demo1() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("utf-8.txt");
		FileWriter fw = new FileWriter("gbk.txt");
		
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
	}

}
