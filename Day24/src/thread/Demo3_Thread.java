package thread;

public class Demo3_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable mr = new MyRunnable();  //创建 runnable子类对象
		Thread t = new Thread(mr);  // 将其当做参数传递给Thread的构造函数
		t.start();   //开启线程
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("bb");
		}

	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i < 1000; i++) {
			System.out.println("aaaaaaaaaaaaaaaa");
		}
	}
	
}
