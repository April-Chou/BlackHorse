package threadmethod;

public class Demo5_Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(this.getName() + " : AAAAAAAAAAAAAA");
				}
			}
		};
		
//		new thread t2
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					if (i == 2) {
						try {
							t1.join(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(this.getName() + " : xxxxxxxxxxxxxxxxx");
				}
				
			}
		};
		
		t1.start();
		t2.start();

	}

}
