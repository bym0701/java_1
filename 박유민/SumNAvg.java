package ������;

import java.util.Scanner;

public class SumNAvg {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� >> ");
		int s1 = sc.nextInt();
		System.out.println("�� ��° ���� >> ");
		int s2 = sc.nextInt();
		System.out.println("�� ��° ���� >> ");
		int s3 = sc.nextInt();
		sc.close();
		
		int sum = s1 + s2 + s3;
		double avg = sum / 3.0;
		
		System.out.println("�� : "+ sum);
		System.out.println("��� : "+ avg);
	}
}
