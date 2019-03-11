package syn;

public class Demo4_Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTicket mt = new MyTicket();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		

	}

}

class MyTicket implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized(Ticket.class) {
				if(tickets <= 0) {
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " This is the " + tickets-- + " sold");
			}
			
		}
	}
	
}
