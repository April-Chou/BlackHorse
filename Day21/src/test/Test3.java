package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/*
 * 1.GET THE FILE
 * 2. jian建立treemap去做统计
 * 3. qu 取出每一个key和value
 * 4. pan 判断key和value是否第一次出现，是则存为1，否则value+1
 * 5. guan 关流
 * 6. jianli 建立bufferwriter
 * 7. xie 写入
 * 8. guan关流
 */
public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("arnold.txt"));
		TreeMap<Character, Integer> tm = new TreeMap<>();
		
//		step 2,3 4
		int x;
		while((x = br.read()) != -1) {
			char c = (char) x;
			if(!tm.containsKey(c)) {
				tm.put(c, 1);
			}
			else {
				tm.put(c, tm.get(c)+1);
			}
		}
		br.close();
//		step 5
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
		for(Character key : tm.keySet()) {
			if(key.equals('\r')) {
				bw.write("huiche" + tm.get(key));
				bw.newLine();
			}
			else if(key.equals('\n')) {
				bw.write("huanhang" + tm.get(key));
				bw.newLine();
			}
			else if(key.equals('\t')) {
				bw.write("table" + tm.get(key));
				bw.newLine();
			}
			else {
				bw.write(key + " = " + tm.get(key));
				bw.newLine();
			}
		}
		bw.close();
		
		

	}

}
