package ������;

import java.util.Scanner;

public class IntegerToTIme {
	public static void main(String[] args) {
		System.out.println("���� �Է� >> ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		
		int hour = i / 3600;
		int remain = i % 3600;
		int minute = remain / 60;
		int second = remain % 60;
		
		System.out.println(hour + "��" + minute + "��" + second + "��");
	}
}
