package ������;

import java.util.Scanner;

public class SearchReplace_161 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		StringBuilder statement = new StringBuilder(sc.nextLine());
		System.out.println("ã���� �ϴ� �ܾ� : ");
		String sword = sc.nextLine();
		System.out.println("�ٲٰ��� �ϴ� �ܾ� : ");
		String rword = sc.nextLine();
		
		int start = statement.indexOf(sword);
		int end = start + sword.length();
		statement.replace(start, end, rword);
		System.out.println(statement);
				
	}
}
