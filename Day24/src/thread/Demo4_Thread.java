package thread;

public class Demo4_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ji 继承Thread类， 重写run方法，将要执行的代码写在run方法中，开启线程。 匿名内部类实现
		 */
		new Thread(){
			public void run() {
				for(int i=0; i < 1000; i++) {
					System.out.println("aaaaaaaaaaaaaaaa");
				}
			}
		}.start();
		
		/*
		 * ni 匿名内部类 实现runnable方法，
		 */
		new Thread(new Runnable() {     // jiang 将runnable的子类对象传递给Thread的构造方法
			@Override                   //chongxie 重写run方法
			public void run() {
				// TODO Auto-generated method stub， 将要执行的代码写在run方法中	
				for(int i=0; i < 1000; i++) {
					System.out.println("xxxxxxxx");
				}
			}
			
		}).start();;                           // kaiqi 开启线程

	}

}
