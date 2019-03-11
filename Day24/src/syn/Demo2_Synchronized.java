package syn;

public class Demo2_Synchronized {
	public static void main(String[] args) {
		Printer2 p = new Printer2();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print1();
				}
				
			}
		}.start();
		
//		new thread
		new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
				
			}
		}.start();
	}


}

class Printer2{
	
	public void print1() {
		Object obj = new Object();
		synchronized(obj) {
			System.out.print("The");
			System.out.print("Withcher");
			System.out.print("III");
			System.out.print("\r\n");
		}
		
	}
	
	public synchronized void print2() {
		
			System.out.print("Wild");
			System.out.print("Hunt");
			System.out.print("\r\n");
		
		
	}
}
