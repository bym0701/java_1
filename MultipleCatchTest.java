package 박유민;

public class MultipleCatchTest {
	public static void main(String[] args) {
	/*	try {
			int arr[] = new int[5];
			arr[4] = 20/0;
			System.out.println("First print statement in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Warning: ArithmeticException");
		}
		catch(Exception e) {
			System.out.println("Warning: Some Other exception");
		}
		
		System.out.println("try-catch 블록 밖...");
	} */
	
	try {
		int arr[] = new int[5];
		arr[6] = 20/5;
		System.out.println("First print statement in try block");
	}
	catch(ArithmeticException e) {
		System.out.println("Warning: ArithmeticException");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Warning: ArrayIndexOutOfBoundsException");
	}
	catch(Exception e) {
		System.out.println("Warning: Some Other exception");
	}
	
	System.out.println("try-catch 블록 밖...");
}
}
