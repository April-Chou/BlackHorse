package other;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo1_SequenceInputStream {

	public static void main(String[] args) throws IOException {
//		demo1();
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		Vector<FileInputStream> v = new Vector<>();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("d.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		
		

	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void demo1() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b;
		while((b = sis.read()) != -1){
			fos.write(b);
		}
		sis.close();
		fos.close();
	}

}
