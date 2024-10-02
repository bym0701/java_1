package 박유민;

import java.util.Scanner;

public class exception_Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		try {
			c = a/b;
		}
		catch(ArithmeticException e) {
			c = -1;
		}
		
		System.out.println("결과는 " + c + "입니다.");
	}
}
