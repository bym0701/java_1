package ������;

import java.util.Scanner;

public class ConditionOperation {
	public static void main(String[] args) {
		
		int val, cnt = 0, sum = 0;
		int [] array = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0�� 100 ������ ���� �Է�(�� ���� ���� �Է��ϸ� ����) : ");
		val = sc.nextInt();
		while (val >= 0 && val <= 100) {
			array[cnt] = val;
			cnt = cnt + 1;
			System.out.println("0�� 100 ������ ���� �Է�(�׿��� ���� �Է��ϸ� ����) : ");
			val = sc.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		sum = array[0];
		
		for(int i = 1; i < cnt; i++) {
			sum = sum + array[i];
			if(array[i] > max) max = array[i];
			if(array[i] < min) min = array[i];
		}
		if(cnt != 0) System.out.println("��� : "+ (double) sum / cnt);
		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);
		sc.close();
	}
}