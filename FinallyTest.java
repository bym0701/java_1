package ������;

public class FinallyTest {
	public static void main(String[] args) {
	/*	try {
			System.out.println("First statement of try block");
			double num = 3.14;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		finally{
			System.out.println("finally ��� �� ...");
		}
		System.out.println("try-catch ��� ��..."); */
	/*	try {
			System.out.println("First statement of try block");
			int num = 5/0;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		finally{
			System.out.println("finally ��� �� ...");
		}
		System.out.println("try-catch ��� ��..."); */
		try {
			System.out.println("First statement of try block");
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		finally{
			System.out.println("finally ��� �� ...");
		}
		System.out.println("try-catch ��� ��...");
	}
}
