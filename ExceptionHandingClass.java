package ������;

public class ExceptionHandingClass {
	public static void main(String[] args) {
		try {
			System.out.println("try�� ����");
			throw new ArithmeticException();
		}
		catch(ArithmeticException e){
			System.out.println("ù ��° catch�� ����" + e.toString());
		}
		catch(Exception e) {
			System.out.println("�� ��° catch�� ����");
		}
		finally {
			System.out.println("finally block ����");
		}
	}
}
