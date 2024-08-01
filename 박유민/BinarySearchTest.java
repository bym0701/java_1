package 박유민;

import java.util.Arrays;

public class BinarySearchTest {
	public static void main(String[] args) {
		int [] a = new int[] {3, 2, 1, 4, 5};
		
		Arrays.sort(a); //오름차순 정렬 a = {1, 2, 3, 4, 5}
		
		int i = Arrays.binarySearch(a, 3);
		System.out.println(i);
		
		i = Arrays.binarySearch(a, 0);
		System.out.println(i);
		
		i = Arrays.binarySearch(a, 6);
		System.out.println(i);
		
		//원하는 값 = 키
		//키 값이 존재할 경우 그 위치를 반환
		//키가 배열에 존재하지않을 경우 넘어오는 값은 음수값인데 실제는 그 키의 삽입위치 값에 1을 더한 값의 음수
		
	}
}
