package ������;

import java.util.Scanner;

public class StringSort {
	public static void main(String[] args) {
		
		final int CNT = 5;
		
		String [] array = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < CNT; i++) {
			System.out.print("�̸�?");
			array[i] = sc.next();
		}
		
		System.out.print("���� �� �̸� : ");
		for(int i = 0; i < CNT; i++) System.out.print(array[i] + " ");
		System.out.println();
		
		String temp;
		int leastIndex;
		for(int i = 0; i < CNT-1; i++) {
			leastIndex = i; //0 1 2 3
			
			for(int j = i+1; j < CNT; j++) { //1 2 3 4
				if(array[j].compareTo(array[leastIndex]) < 0) leastIndex = j;
				//str1.compareTo(str2) str1�� ������ ������ ��, ũ�� ����� ��, ������ 0\
				//���ؼ� ������ leastIndex�� �ε��� ���� �ְ�
				//temp�� ū ���� �ְ�, ū ���� �������� �ְ�, ���������� �ٽ� ū���� �����鼭 ���� ������� ����
				//���ڿ��� ũ�⸦ ���� ����
			}
			temp = array[i];
			array[i] = array[leastIndex];
			array[leastIndex] = temp;
		}
		
		System.out.print("���� �� �̸� : ");
		for(int i = 0; i < CNT; i++) System.out.print(array[i] + " ");
		System.out.println();
		
		sc.close();
	}
}
