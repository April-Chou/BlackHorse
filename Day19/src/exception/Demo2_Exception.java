package exception;
/*
 * try 用来检测异常
 * catch 捕获异常
 * finally 释放资源
 */

public class Demo2_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		try {
			int x = d1.div(10, 2);
			System.out.println(x);
		}
		catch(ArithmeticException a) {
			System.out.println("chu shu wei 0");
		}
			

	}

}

class Demo{
	public int div(int x, int y) {
		return x / y;
	}
}
