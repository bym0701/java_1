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
			case 's' : SignIn(ids, pws, count); break;
			case 'l' : LogIn(ids, pws, count); break;
			case 'e' : System.out.println("�ý��� ����Ǿ����ϴ�.");
			return;
			}
		}while(true);
	}
	
	public static void SignIn(String[] ids, String[] pws, int count) {
		Scanner sc = new Scanner(System.in);
		count++;
		System.out.println("���̵� : ");
		ids[count] = sc.nextLine();
		System.out.println("�н����� : ");
		pws[count] = sc.nextLine();
		System.out.println("ȸ�����ԵǾ����ϴ�.");
		System.out.println(count);
		//count�ȴ���
	}
	
	public static void LogIn(String[] ids, String[] pws, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� : ");
		String LoginId = sc.nextLine();
		System.out.println("�н����� : ");
		String LoginPw = sc.nextLine();
		
		LoginId = LoginId.trim();
		LoginPw = LoginPw.trim();
		
		LoginId = LoginId.toLowerCase();
		LoginPw = LoginPw.toLowerCase();
		
		int flag = 0;
		
		for(int i = 0; i < count; i++) {
			if(ids[count].equals(LoginId)) {
				if(pws[count].equals(LoginPw))flag = 1;
				else flag = 2;	
			}
			else flag = 3;
		}
		if(flag == 1) System.out.println("�α��εǾ����ϴ�.");
		else if(flag == 2)System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
		else if(flag == 3)System.out.println("���̵� �������� �ʽ��ϴ�.");
		System.out.println(flag);
		//flag�Ⱥ���
		
	}
	
}
