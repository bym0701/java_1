package ������;

import java.util.Arrays;
import java.util.Scanner;

public class ConditionOperation_search {
	public static void main(String args[]) {
		int val, cnt = 0, sum = 0;
		int [] array = new int[100];
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("0�� 100 ������ ���� �Է�(�� ���� ���� �Է��ϸ� ����) : ");
		val = sc.nextInt();
		while(val >= 0 && val <= 100) {
			array[cnt] = val;
			cnt = cnt+1;
			System.out.println("0�� 100 ������ ���� �Է�(�� ���� ���� �Է��ϸ� ����) : ");
			val = sc.nextInt();
		}
		
		Arrays.sort(array, 0 , cnt); //�������� ����
		
		System.out.println("���� �� ����");
		for(int i = 0; i < cnt; i++) System.out.print(array[i] + " ");
		System.out.println();
		
		System.out.print("ã���� �ϴ� ������ �Է��ϼ���. : ");
		
		val = sc.nextInt();
		
		int i = Arrays.binarySearch(array, 0, cnt, val); //array���� 0(�ε��� ó��)���� cnt(�ε��� ��)�������� val�� ã�´�.
		if (i < 0) { //val�� ������ ������ ����
			System.out.println("���ϴ� ������ �迭�� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println("���ϴ� ������ �迭�� "+ (i+1) + " ��°�� �����մϴ�.");
		}
		
		sc.close();
	}
}
