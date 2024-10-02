package ������;

public class ExceptionDemo {
	public static void main(String[] args) {
		ExceptionDemo app = new ExceptionDemo();
		try {
			app.method1();
		}
		catch(ArithmeticException e) {
			System.out.println("ù ��° catch�� ����" + e.toString());
		}
		catch(Exception e) {
			System.out.println("�� ��° catch�� ����");
		}
		finally {
			System.out.println("finally block ����");
		}
		
	}
	private void method1() {
		System.out.println("try�� ����");
		throw new ArithmeticException();
	}
}
