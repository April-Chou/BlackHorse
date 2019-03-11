package threadmethod;

public class Demo4_Daemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0; i<2; i++) {
					System.out.println(getName() + " aaaaa");
				}
				
			}
		};
		
//		new Thread t2
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0; i<50; i++) {
					System.out.println(getName() + " bbbb");
				}
				
			}
		};
		
		/*
		 * dang 当传入true设置为守护线程
		 */
		t2.setDaemon(true);
		t1.start();
		t2.start();

	}

}
