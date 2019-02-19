package file;

import java.io.File;
import java.util.Date;

public class Demo5_FileMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("ccc.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.lastModified());//hao 毫秒值
		
		Date d = new Date(file.lastModified());
		System.out.println(d);
		
		File dir = new File("C:\\Users\\cwx636164\\Desktop\\Aspiegel");//jinwei 仅为了获取文件名
		String [] arr = dir.list();
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		File [] subFile = dir.listFiles();// huo 获取了文件对象
		
		for(File f : subFile) {
			System.out.println(f);
		}
		

	}

}
