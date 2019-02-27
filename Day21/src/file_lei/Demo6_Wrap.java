package file_lei;
/*
 * zhuang装饰设计模式的好处： 耦合性不强，被装饰的类的变化与装饰类的变化无关
 */

public class Demo6_Wrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Coder {
	public void code();
}

class Student implements Coder{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("Java SE");
		System.out.println("C++");
	}
}
