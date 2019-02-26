package file_lei;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//demo1();
		FileReader fr = new FileReader("xxx.txt");
		
		int c;
		while((c = fr.read()) != -1) {
			char x = (char) c;
			System.out.print(x);
		}
		

	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		int x = fr.read();
		char c =(char) x;
		System.out.println(c);
	}

}
