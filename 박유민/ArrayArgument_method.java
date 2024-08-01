package ������;

import java.util.Random;

public class ArrayArgument_method {
	public static void main(String[] args) {
		
		int [] array = new int[10];
		Random rnd = new Random();
		
		for(int i = 0; i < 10; i++) array[i] = rnd.nextInt();
		
		System.out.print("���� �� :");
		printArray(array);
		
		increaseArray(array);
		
		System.out.print("���� �� : ");
		printArray(array);
	}
	
	public static void increaseArray(int[] arr) { // arr ������ array ������ ������ �迭 ��ü�� ��Ī�ϰ� ����.
		for(int i = 0; i < arr.length; i++) arr[i]++;
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println();
	}
}
