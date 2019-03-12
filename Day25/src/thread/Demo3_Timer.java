package thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo3_Timer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		t.schedule(new MyTimerTask(), new Date(119, 2, 12, 14, 00, 30), 3000);
		
		while(true) {
			Thread.sleep(1000);
			System.out.println(new Date());
			
		}

	}

}

class MyTimerTask extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Go to Gym");
	}
	
}
