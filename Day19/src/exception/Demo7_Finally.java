package exception;

/*
 * finally 特点： 被finally控制的语句一定会被执行
 * 
 * finally 作用： 用于释放IO流
 */

public class Demo7_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1 / 0);
		}catch(Exception e) {
			System.out.println("chushu wei 0");
			System.exit(0 );// tuichu 退出JVM虚拟机
			return ;
		} finally {
			System.out.println("did yet?");
		}

	}

}
