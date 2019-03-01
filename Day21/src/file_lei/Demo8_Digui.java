package file_lei;
// digui递归如果调用次数过多 容易导致栈内存溢出 static overflow error
// chuxian 出现0是因为到达int最大值
// digui 的好处：
//     bu 不用知道循环次数
//   gou构造方法不能使用递归调用
//  di 递归调用不一定有返回值
public class Demo8_Digui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//demo_for_loop();
		System.out.println(digui(10));

	}

	/**
	 * 
	 */
	private static void demo_for_loop() {
		//		for loop to do 5!
				int result = 1;
				for(int i =1; i<=5; i++) {
					result = result * i;
				}
				System.out.println(result);
	}
	
//	di gui
	public static int digui(int num) {
		if(num == 1) {
			return 1;
		}
		else {
			return num * digui(num -1);
		}
	}

}


