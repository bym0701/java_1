package ������;

public class Assignment {
	public static void main(String[] args) {
		char c = '��';
		
		System.out.println("���� : " + c);
		
		int code = c;
		System.out.println("�����ڵ� : " + Integer.toHexString(code));
		
		int i = 0xd55d;
		char c2 = (char) i;
		System.out.println("���� :" + c2);
	}
}
