package otherIO;

import java.util.Enumeration;
import java.util.Properties;

public class Demo10_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo();
		Properties prop = new Properties();
		
		prop.setProperty("name", "xiaoguo");
		prop.setProperty("tel", "003531234567");
		
		System.out.println(prop);
		
//		meiju
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
