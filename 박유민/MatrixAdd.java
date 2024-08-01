package 박유민;

import java.util.Random;

public class MatrixAdd {
	public static void main(String[] args) {
		
		int [][] m1 = new int[3][3], m2 = new int[3][3], m3 = new int[3][3];
		
		randomsetArray(m1,m2);
		
		addArray(m1, m2, m3);
		
		printArray(m1);
		printArray(m2);
		
		System.out.println("=================");
		printArray(m3);
		
	}
	
	//행렬 초기화
	public static void randomsetArray(int[][] arr,int[][] arr2) {
		Random rnd = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rnd.nextInt(100);
				arr2[i][j] = rnd.nextInt(100);
			}
		}
	}
	
	//행렬 덧셈
	public static void addArray(int[][] arr1, int[][] arr2, int[][] arr3) {
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
	}
	
	//행렬 출력
	public static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) { 
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();	
	}

}