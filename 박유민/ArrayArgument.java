package ������;

import java.util.Random;

public class ArrayArgument { //ũ�Ⱑ 10�� ������ �迭�� �ʱ� ���� �������� �ʱ�ȭ�� �� ���� ���� �޼��带 ���� �ϳ��� ����
	public static void main(String[] args) {
		
		int [] array = new int[10];
		Random rnd = new Random();
		
		for(int i = 0; i < 10; i++) array[i] = rnd.nextInt();
		
		System.out.print("���� �� :");
		for(int i = 0; i < 10; i++) System.out.print(array[i] + " ");
		System.out.println();
		
		for(int i = 0; i < 10; i++) array[i]++;
		
		System.out.print("���� �� : ");
		for(int i = 0; i < 10; i++) System.out.print(array[i] + " ");
		System.out.println();
	}
}
