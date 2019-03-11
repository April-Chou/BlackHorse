package threadmethod;

public class Demo7_SetPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			public void run() {
				for(int i =0; i<1000; i++) {
					System.out.println(getName() + ": aaaa");
				}
			}
		};
//		new thread
		Thread t2 = new Thread() {
			public void run() {
				for(int i =0; i<1000; i++) {
					System.out.println(getName() + ": xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				}
			}
		};
		
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		t2.start();

	}

}
