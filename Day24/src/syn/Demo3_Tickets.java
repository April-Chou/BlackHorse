package syn;

public class Demo3_Tickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();

	}

}

class Ticket extends Thread {
	private static int ticket = 100;
	
	public void run() {
		while(true) {
			synchronized(Ticket.class) {
				if(ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName() + " This is the " + ticket-- + " sold");
			}
			
		}
	}
}