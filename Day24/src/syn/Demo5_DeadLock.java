package syn;

public class Demo5_DeadLock {
	
	private static String s1 = "spoon1";
	private static String s2 = "spoon2";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				while (true) {
					synchronized(s1) {
						System.out.println(getName() + "Get: " + s1 + ", wait " + s2);
						synchronized(s2) {
							System.out.println(getName() + "Get: " + s2 + ", start to eat");
						}
					}
				}
				
			}
		}.start();
//		
//		new thread
		new Thread() {
			public void run() {
				while (true) {
					synchronized(s2) {
						System.out.println(getName() + "Get: " + s2 + ", wait " + s1);
						synchronized(s1) {
							System.out.println(getName() + "Get: " + s1 + ", start to eat");
						}
					}
				}
				
			}
		}.start();

	}

}
