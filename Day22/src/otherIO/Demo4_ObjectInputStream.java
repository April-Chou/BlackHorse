package otherIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
 * dui 对象输入流，反序列化 EOFException， 当文件读取到了末尾时，出现此异常End of File
 */
import java.util.ArrayList;

import bean.Person;

public class Demo4_ObjectInputStream {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		demo1();
//		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		ArrayList<Person> list = new ArrayList<>();
		list = (ArrayList<Person>) ois.readObject();
		
		for(Person p : list) {
			System.out.println(p);
		}
		ois.close();
		

	}

	/**
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unused")
	private static void demo1() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
