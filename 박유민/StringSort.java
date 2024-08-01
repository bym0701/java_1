package 박유민;

import java.util.Scanner;

public class StringSort {
	public static void main(String[] args) {
		
		final int CNT = 5;
		
		String [] array = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < CNT; i++) {
			System.out.print("이름?");
			array[i] = sc.next();
		}
		
		System.out.print("정렬 전 이름 : ");
		for(int i = 0; i < CNT; i++) System.out.print(array[i] + " ");
		System.out.println();
		
		String temp;
		int leastIndex;
		for(int i = 0; i < CNT-1; i++) {
			leastIndex = i; //0 1 2 3
			
			for(int j = i+1; j < CNT; j++) { //1 2 3 4
				if(array[j].compareTo(array[leastIndex]) < 0) leastIndex = j;
				//str1.compareTo(str2) str1이 작으면 음수의 값, 크면 양수의 값, 같으면 0\
				//비교해서 작으면 leastIndex에 인덱스 값을 넣고
				//temp에 큰 값을 넣고, 큰 값에 작은값을 넣고, 작은값에는 다시 큰값을 넣으면서 작은 순서대로 정렬
				//문자열의 크기를 통해 비교함
			}
			temp = array[i];
			array[i] = array[leastIndex];
			array[leastIndex] = temp;
		}
		
		System.out.print("정렬 후 이름 : ");
		for(int i = 0; i < CNT; i++) System.out.print(array[i] + " ");
		System.out.println();
		
		sc.close();
	}
}
