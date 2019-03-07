package otherIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Demo10_Properties {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
//		demo();
//		demo1();
		Properties prop = new Properties();
		System.out.println("Before : " + prop);
		prop.load(new FileInputStream("config.properties"));
		System.out.println("After : " + prop);
		
//		load and strore
		/*
		 * zhi 只set 不strore只是在内存中修改，不是在硬盘中修改，文件的内容是不变的，必须是store里output stream才可以
		 */
		prop.setProperty("age", "22");
		prop.setProperty("Job", "Witcher");
		/*
		 * stroe,第二个参数是用来描述文件列表的，如果不描述可以传null
		 */
		prop.store(new FileOutputStream("config.properties"), "xxx");
		System.out.println("Finally : " + prop);

	}

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static void demo1() {
		Properties prop = new Properties();
		
		prop.setProperty("name", "xiaoguo");
		prop.setProperty("tel", "003531234567");
		
		System.out.println(prop);
		
//		meiju
		@SuppressWarnings("unchecked")
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		
//		loop
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}

	/**
	 * 
	 */
	private static void demo() {
		Properties prop = new Properties();
		prop.put("abc", 123);
	}

}
