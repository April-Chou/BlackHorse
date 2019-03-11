package threadmethod;

public class Demo1_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		demo2();

	}

	/**
	 * 
	 */
	private static void demo2() {
		new Thread() {
			public void run() {
				this.setName("Xiao Guo");
				System.out.println(this.getName() + " : aaaaa");
			}
		}.start();
		
//		new thread
		new Thread() {
			public void run() {
				this.setName("Ciri");
				System.out.println(this.getName() + " : cdefghijklmn");
			}
		}.start();
	}

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	/*
	 * 通过构造方法给name赋值
	 */
	private static void demo1() {
		new Thread("Geralt") {    //gei 给线程名称赋值
			public void run() {
				System.out.println(this.getName() + " : aaaaaaaaa");
			}
		}.start();
		
		new Thread("Yennefer") {
			public void run() {
				System.out.println(this.getName() + " : bbbbbbb");
			}
		}.start();
	}

}
