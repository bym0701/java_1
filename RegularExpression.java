package ������;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	private static String getString(String str1, String str2, String str3) {
		String input;
		Pattern pattern;
		Matcher m;
		
		Scanner sc = new Scanner(System.in);
		pattern = Pattern.compile(str2);
		
		while(true) {
			System.out.println(str1);
			input = sc.nextLine();
			m = pattern.matcher(input);
			
			if(!m.matches()) {
				System.out.println(str3);
			}
			else break;
		}
		return input;
	}
	
	public static void main(String[] args) {
		String name = getString("�̸� : ","^[��-�R]{2,4}$","�̸� ���Ŀ� ���� �ʽ��ϴ�.");
		String address = getString("�ּ� : ", "^[��-�R]{2,4}��\\s+[��-�R]{2,4}��\\s+[��-�R]{2,6}��\\s+\\d{2,4}$", "�ּ� ���Ŀ� ���� �ʽ��ϴ�.");
		String address_number = getString("�����ȣ : ", "^\\d{5}$", "�����ȣ ���Ŀ� ���� �ʽ��ϴ�.");
		String phone_number = getString("�ڵ��� ��ȣ : ", "^01[01]-\\d{4}-\\d{4}$", "�ڵ��� ��ȣ ���Ŀ� ���� �ʽ��ϴ�.");
		String bloodtype = getString("������ : ", "^[OAB]{1,2}��$", "������ ���Ŀ� ���� �ʽ��ϴ�.");
		String birth = getString("���� : ", "\\d{4}��\\s+\\d{2}��\\s+\\d{2}��$", "���� ���Ŀ� ���� �ʽ��ϴ�.");
		String gender = getString("���� : ", "^(��|��)$", "���� ���Ŀ� �����ʽ��ϴ�.");
		
		
		System.out.println("��� �ڷḦ ���Ŀ� �°� �Է��ϼ̽��ϴ�.");
		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+address);
		System.out.println("�����ȣ : "+address_number);
		System.out.println("�ڵ��� ��ȣ : "+phone_number);
		System.out.println("������ : "+bloodtype);
		System.out.println("���� : "+birth);
		System.out.println("���� : "+gender);
		
		/*Scanner sc = new Scanner(System.in);
		String input;
		Pattern pattern;
		Matcher m;
		
		System.out.println("�̸� : ");
		input = sc.nextLine();
		pattern = Pattern.compile("^[��-�R]{2,4}$");
		m = pattern.matcher(input);
		if(!m.matches()) {
			System.out.println("�̸� ���Ŀ� ���� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("�ּ� : ");
		input = sc.nextLine();
		pattern = Pattern.compile("^[��-�R]{2,4}��\\s+[��-�R]{2,4}��\\s+[��-�R]{2,6}��\\s+\\d{2,4}$");
		m = pattern.matcher(input);
		if(!m.matches()) {
			System.out.println("�ּ� ���Ŀ� ���� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("�����ȣ : ");
		input = sc.nextLine();
		pattern = Pattern.compile("^\\d{5}$");
		m = pattern.matcher(input);
		if(!m.matches()) {
			System.out.println("�����ȣ ���Ŀ� ���� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("�ڵ��� ��ȣ : ");
		input = sc.nextLine();
		pattern = Pattern.compile("^01[01]-\\d{4}-\\d{4}$");
		m = pattern.matcher(input);
		if(!m.matches()) {
			System.out.println("�ڵ��� ��ȣ ���Ŀ� ���� �ʽ��ϴ�.");
			return;
		}
		*/
		
	}

}
