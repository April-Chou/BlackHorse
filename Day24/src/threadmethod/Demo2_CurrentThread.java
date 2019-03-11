package threadmethod;

public class Demo2_CurrentThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				Thread.currentThread().setName("Geralt");
				System.out.println(this.getName() + " : aaaaa");
			}
		}.start();
		
//		runnable
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Thread.currentThread().setName("Yennefer");
				System.out.println(Thread.currentThread().getName() + " : bbbb");
			}
			
		}).start();
		
//		set main thread
		Thread.currentThread().setName("main Thread");
		System.out.println(Thread.currentThread().getName() + " : hahah");

	}

}
