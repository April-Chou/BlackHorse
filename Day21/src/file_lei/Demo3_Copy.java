package file_lei;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("xxx.txt");
		FileWriter fw = new FileWriter("zzz.txt");
		
		int c;
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();// ru 如果不关流就会将内容写道缓冲区里，关流就会将内容刷新出来
		

	}

}
