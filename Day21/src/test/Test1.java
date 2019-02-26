package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
 * liu 流对象尽量晚开早关
 */
public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("reverse.txt"));
		
		ArrayList<String> list = new ArrayList<>();
		String line;
		
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		
		for(int i=list.size()-1; i>=0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		
		br.close();
		bw.close();

	}

}
