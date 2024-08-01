package 박유민;

import java.util.Random;

public class ArrayArgument { //크기가 10인 정수형 배열의 초기 값을 랜덤으로 초기화한 후 이의 값을 메서드를 통해 하나씩 증가
	public static void main(String[] args) {
		
		int [] array = new int[10];
		Random rnd = new Random();
		
		for(int i = 0; i < 10; i++) array[i] = rnd.nextInt();
		
		System.out.print("변경 전 :");
		for(int i = 0; i < 10; i++) System.out.print(array[i] + " ");
		System.out.println();
		
		for(int i = 0; i < 10; i++) array[i]++;
		
		System.out.print("변경 후 : ");
		for(int i = 0; i < 10; i++) System.out.print(array[i] + " ");
		System.out.println();
	}
}
