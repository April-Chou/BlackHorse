package exception;

public class Demo5_Throwable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
