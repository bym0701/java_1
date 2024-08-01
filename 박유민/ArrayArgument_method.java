package 박유민;

import java.util.Random;

public class ArrayArgument_method {
	public static void main(String[] args) {
		
		int [] array = new int[10];
		Random rnd = new Random();
		
		for(int i = 0; i < 10; i++) array[i] = rnd.nextInt();
		
		System.out.print("변경 전 :");
		printArray(array);
		
		increaseArray(array);
		
		System.out.print("변경 후 : ");
		printArray(array);
	}
	
	public static void increaseArray(int[] arr) { // arr 변수와 array 변수가 동일한 배열 객체를 지칭하고 있음.
		for(int i = 0; i < arr.length; i++) arr[i]++;
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println();
	}
}
