package ¹ÚÀ¯¹Î;

public class MultiDimensionTest {
	public static void main(String[] args) {
		int [][] array = {{62, 17, 42, 64}, {18, 96, 29, 5}, {6, 3, 6, 5}};
		
		for(int i = 0; i < array.length; i++) {
			System.out.println();
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		
		System.out.println();
				
	}
}
