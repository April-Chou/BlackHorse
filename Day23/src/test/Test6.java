package test;

import java.math.BigInteger;

public class Test6 {
	public static void main(String[] args) {
//		demo1();
		
		/*
		 * get 1000!
		 */
		BigInteger number = new BigInteger("1");
		for(int i=1; i<=1000; i++) {
			BigInteger var = new BigInteger(i + "");
			number = number.multiply(var);	
		}
		
		System.out.println(number);
		String str = number.toString();  
//		huoqu获取字符串中的每一个字符，用charAt
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if('0' == str.charAt(i)) {
				count = count + 1;
			}
		}
		System.out.println(count);
		
//		reverse the String
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		StringBuilder sb1 = sb.reverse();
		
//		for loop
		int countZero = 0;
		for(int i=0; i <= sb.length(); i++) {
			if('0' != sb1.charAt(i)) {
				break;
			}
			else {
				countZero ++;
			}
		}
//		print the end zero count
		System.out.println("The count of end zero is " + countZero);
	}

	/**
	 * qiu 1000! zhong suoyou de 0
	 */
	@SuppressWarnings("unused")
	private static void demo1() {
		long result = 1;
		for(int i=1; i<= 1000; i++) {
			result = result * i;
		}
		
		System.out.println(result);
		
		/*
		 * tai 太大了，需要用big integer做. BigInteger用法忘了
		 */
		BigInteger number = new BigInteger("1");
		for(int i=1; i<=1000; i++) {
			BigInteger var = new BigInteger(i + "");
			number = number.multiply(var);	
		}
		
		System.out.println(number);
		String str = number.toString();  
//		huoqu获取字符串中的每一个字符，用charAt
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if('0' == str.charAt(i)) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
