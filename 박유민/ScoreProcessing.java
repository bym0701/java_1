package ������;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreProcessing {
	public static void main (String[] args) {
		
		int val, cnt = 0, sum = 0;
		int [] array = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0�� 100 ������ ���� �Է�(�� ���� ���� �Է��ϸ� ����) : ");
		val = sc.nextInt();
		
		while(val >= 0 && val <= 100) {
			array[cnt] = val;
			cnt = cnt+1;
			System.out.println("0�� 100 ������ ���� �Է�(�� ���� ���� �Է��ϸ� ����) : ");
			val = sc.nextInt();
		}
		
		System.out.print("���� �� ���� : ");
		for(int i = 0; i < cnt; i++) System.out.print(array[i] + " ");
		System.out.println();
		
		Arrays.sort(array, 0, cnt);
		
		System.out.print("���� �� ���� : ");
		for(int i = 0; i < cnt; i++) System.out.print(array[i] + " ");
		System.out.println();
		
		sc.close();
		
	}
}
