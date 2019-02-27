package file_lei;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo5_LineNumberReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LineNumberReader lnr = new LineNumberReader(new FileReader("zzz.txt"));
		String line;
		while((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ": " + line);
		}

	}

}
