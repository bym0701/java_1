package ������;

public class Example_Exception {
	public static void main(String[] args) {
		/*try {
			String arr[] = {"a", "b", "c", "d", "e"};
			
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε����� ������ ��� �����߽��ϴ�. �����ٶ��ϴ�.");
		}
	 	try {
			int n = Integer.parseInt("XYZ");
			System.out.println(n);
		}catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ �Ұ����� ���ڿ��� parseInt �޼����� �μ��� �־������ϴ�.");
		}
		
		try {
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}*/
		
		try {
			throw new NullNameException();
		}
		catch(NullNameException e) {
			System.out.println("����� ���� ���� �߻�");
			System.out.println(e);
		}
		try {
			throw new CountZeroException("hoho");
		}catch(CountZeroException e) {
			System.out.println(e);
		}
	}
}
class NullNameException extends Exception{
	public String toString() {
		return("�̸� ������");
	}
}
class CountZeroException extends Exception{
	public CountZeroException() {};
	public CountZeroException(String message) {
		super(message);
	}
}