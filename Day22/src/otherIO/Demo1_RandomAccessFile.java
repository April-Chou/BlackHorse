package otherIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo1_RandomAccessFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("g.txt","rw");
		raf.write(97);
		
//		int x = raf.read();
//		System.out.println(x);
		raf.seek(10);
		raf.write(98);
		raf.close();

	}

}
