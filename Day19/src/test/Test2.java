package test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		
		while(true) {
			String line = sc.nextLine();
			try {
				
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));
				break;
			}
			catch(Exception e) {
				try {
					new BigInteger(line);
					System.out.println("Integer too big， please enter again: ");
				}catch(Exception e1) {
					try {
						new BigDecimal(line);
						System.out.println("Please enter a integer, its a decimal ");
					}catch(Exception e2) {
						System.out.println("Other carachater: ");
					}
					
				}
				
			}
		}
		sc.close();
		
		
		
	}

}
