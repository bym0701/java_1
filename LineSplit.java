package ������;

import java.util.Scanner;

public class LineSplit {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڵ��� �������� �����Ͽ� �Է�  : ");
		String statement = sc.nextLine();
		
		String [] split = null;
		split = statement.split(" ");
		int sum = 0;
		for (String s : split) sum += Integer.parseInt(s);
		System.out.println(sum);
		
	}
}
