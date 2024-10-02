package ������;

public class NestTryTest {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("���� try ���1");
				int b = 5/0;
				System.out.println(b);
			}
			catch(ArithmeticException e1) {
				System.out.println("���� catch��1");
			}
			try {
				System.out.println("���� try ���2");
				int b = 5/0;
				System.out.println(b);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("���� catch��2");
			}
			System.out.println("���� try-catch�� ��� ��...");
		}
		catch(ArithmeticException e3) {
			System.out.println("Arithmetic Exception");
			System.out.println("�ٱ� catch��1");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("�ٱ� catch��2");
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("�ٱ� catch��3");
		}
	}
}
