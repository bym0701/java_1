package ������;

import java.util.Scanner;

public class ProgramBasic_382 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner (System.in);
			System.out.print(">> ");
			while(sc.hasNextInt()) {
				int i = sc.nextInt();
				System.out.println("�Է� ��: " + i);
				System.out.println(">> ");
			}
			System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
