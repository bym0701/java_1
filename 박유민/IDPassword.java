package ������;

import java.util.Scanner;

public class IDPassword {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� : ");
		String login = sc.next();
		System.out.println("�н����� : ");
		String password = sc.next();
		
		login = login.trim(); //�յ� ���� ����
		password = password.trim();
		
		login = login.toLowerCase(); //�ҹ��ڷ� ��ȯ
		password  = password.toLowerCase();
		
		if(login.equals("bmkim")) {
			if(password.equals("koala")) {
				System.out.println("���̵� �н����� ��� ��ġ�մϴ�.");
			}
			else {
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
			}
		}
		else {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		}
		
		
	}
}
