package ������;

import java.util.Scanner;

public class ConditionOperation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("ù ��° ���� (������ ����) >> ");
		int s1 = sc.nextInt();
		System.out.println("�� ��° ���� (������ ����) >> ");
		int s2 = sc.nextInt();
		sc.close();
		
		s1 = s1 > 0 ? s1 : -s1;
		s2 = s2 > 0 ? s2 : -s2;
		
		int sum = s1 + s2;
		int max = s1 > s2 ? s1 : s2;
		
		System.out.println("���� �� : " + sum);
		System.out.println("���� �ִ� : " + max);
	}
}

