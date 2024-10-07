package ������;

public class NestTryTest {
	public static void main(String[] args) {
		try { //1
			try { //2
				System.out.println("���� try ���1"); //3
				int b = 5/0; //4
				System.out.println(b); 
			}
			catch(ArithmeticException e1) { //5
				System.out.println("���� catch��1"); //6
			}
			try { //7
				System.out.println("���� try ���2"); //8
				int b = 5/0; //9
				System.out.println(b);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("���� catch��2");
			}
			System.out.println("���� try-catch�� ��� ��...");
		}
		catch(ArithmeticException e3) { //10
			System.out.println("Arithmetic Exception"); //11
			System.out.println("�ٱ� catch��1"); //12
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("�ٱ� catch��2");
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("�ٱ� catch��3");
		}
		System.out.println("�ٱ� try-catch ��� ��..."); //13
	}	
}
