package 박유민;

import java.util.Scanner;

public class ConditionOperation {
	public static void main(String[] args) {
		
		int val, cnt = 0, sum = 0;
		int [] array = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0과 100 사이의 값을 입력(그 외의 값을 입력하면 종료) : ");
		val = sc.nextInt();
		while (val >= 0 && val <= 100) {
			array[cnt] = val;
			cnt = cnt + 1;
			System.out.println("0과 100 사이의 값을 입력(그외의 값을 입력하면 종료) : ");
			val = sc.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		for(int i = 1; i < cnt; i++) {
			sum = sum + array[i];
			if(array[i] > max) max = array[i];
			if(array[i] < min) min = array[i];
		}
		if(cnt != 0) System.out.println("평균 : "+ (double) sum / cnt);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		sc.close();
	}
}
