package test;

import java.util.Scanner;

public class SignInLogIn {
	public static void main(String[] args) {
		//ȸ�������ϱ�, �α����ϱ�, �ý��� ����
		
		String[] ids = new String[100];
		String[] pws = new String[100];
		int count=0;
		char menuChar;
		
		do {
			//�޴� ���
			System.out.println("s : ȸ������ �ϱ�");
			System.out.println("l : �α��� �ϱ�");
			System.out.println("e : ���α׷� ����");
			
			//�޴� ����
			System.out.print("���ϴ� �޴� ���� (s, l, e) �� �ϳ��� �Է��ϼ���. : ");
			Scanner sc = new Scanner(System.in);
			menuChar = sc.next().charAt(0);
			
			//�޴� ó��
			switch(menuChar) {
			case 's' : SignIn(ids, pws); break;
			case 'l' : LogIn(ids, pws); break;
			case 'e' : System.out.println("�ý��� ����Ǿ����ϴ�.");
			return;
			}
		}
	}
}
