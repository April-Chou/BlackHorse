package otherIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo9_Data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("h.txt"));
		dos.writeInt(997);
		dos.writeInt(998);
		dos.writeInt(999);
		
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("h.txt"));
		
		int x = dis.readInt();
		int y = dis.readInt();
		int z = dis.readInt();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		dis.close();
		

	}

}
