package ������;

public class Test {
	public static void main(String args[]) {
		String regExp = "01[078]-\\d{4}-\\d{4}"; //010 or 017 or 018 - 4�ڸ� - 4�ڸ�
		
		String Str = new String("010-5182-0173");
		System.out.println(Str.matches(regExp));
		
		Str = new String("013-5182-0173");
		System.out.println(Str.matches(regExp));
		
		Str = new String("013-518-0173");
		System.out.println(Str.matches(regExp)); //���ڿ��� Ư�� ���Ͽ� ���յǴ���, Ư�� ���Ͽ� �ش��ϴ� �κ� ���ڿ��� �����ϴ���
	}
}
