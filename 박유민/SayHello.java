package ������;

import java.util.Scanner;

public class SayHello {
	public static void main(String[] args) {
		System.out.println("�̸� �Է� >> ");
		Scanner sc = new Scanner (System.in);
		String name = sc.next();
		sc.close();
		
		String helloMessage = "�ȳ��ϼ���. "+name+"��, �ڹ� ���迡 ���� ���� ���ϵ帳�ϴ�.";
		
		System.out.println(helloMessage);
		
	}
}
