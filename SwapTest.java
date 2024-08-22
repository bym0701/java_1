package ¹ÚÀ¯¹Î;

public class SwapTest {
	public static void main(String[] args) {
		
	//	int x = 5, y = 3; //tmp;
		
		/*
		tmp = x;
		x = y;
		y = tmp;
		*/
		
	//	swap(x, y);
		
		int [] arr = new int[] {5, 3};
		
		swap(arr, 0, 1);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	//	System.out.println(x);
	//	System.out.println(y); 
	}
	
	public static void swap(int[] arr, int idx1, int idx2) {
		int tmp;
		
		tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
/*	public static void swap(int a, int b) {
		int tmp;
		
		tmp = a;
		a = b;
		b = tmp;
	} */
}
