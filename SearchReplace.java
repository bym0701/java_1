package ������;

import java.util.Scanner;

public class SearchReplace {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		String statement = sc.nextLine();
		System.out.println("ã���� �ϴ� �ܾ� : ");
		String sword = sc.next();
		System.out.println("�ٲٰ��� �ϴ� �ܾ� : ");
		String rword = sc.next();//nextLine���� ���� �ƴϸ� �����ֱ�
		
		statement = statement.replaceFirst(sword, rword);
		System.out.println(statement);
		
		
	}
}
