package 박유민;

import java.util.Arrays;
import java.util.Scanner;

public class ConditionOperation_search {
	public static void main(String args[]) {
		int val, cnt = 0, sum = 0;
		int [] array = new int[100];
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("0과 100 사이의 값을 입력(그 외의 값을 입력하면 종료) : ");
		val = sc.nextInt();
		while(val >= 0 && val <= 100) {
			array[cnt] = val;
			cnt = cnt+1;
			System.out.println("0과 100 사이의 값을 입력(그 외의 값을 입력하면 종료) : ");
			val = sc.nextInt();
		}
		
		Arrays.sort(array, 0 , cnt); //오름차순 정렬
		
		System.out.println("정렬 후 성적");
		for(int i = 0; i < cnt; i++) System.out.print(array[i] + " ");
		System.out.println();
		
		System.out.print("찾고자 하는 성적을 입력하세요. : ");
		
		val = sc.nextInt();
		
		int i = Arrays.binarySearch(array, 0, cnt, val); //array에서 0(인덱스 처음)부터 cnt(인덱스 끝)까지에서 val을 찾는다.
		if (i < 0) { //val이 없으면 음수가 나옴
			System.out.println("원하는 성적이 배열에 존재하지 않습니다.");
		}
		else {
			System.out.println("원하는 성적은 배열의 "+ (i+1) + " 번째에 존재합니다.");
		}
		
		sc.close();
	}
}
