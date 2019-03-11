package thread;

public class Demo2_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
//		mt.run();  并没有开启线程， 要用start
		/*
		 * 必须要用 start方法
		 */
		mt.start();
		
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("bb");
		}
		

	}


}

class MyThread extends Thread{
	public void run() {
		for(int i=0; i < 1000; i++) {
			System.out.println("aaaaaaaaaaaaaaaa");
		}
	}
}