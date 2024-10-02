package 박유민;

public class NestTryTest {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("내부 try 블록1");
				int b = 5/0;
				System.out.println(b);
			}
			catch(ArithmeticException e1) {
				System.out.println("내부 catch문1");
			}
			try {
				System.out.println("내부 try 블록2");
				int b = 5/0;
				System.out.println(b);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("내부 catch문2");
			}
			System.out.println("내부 try-catch문 블록 밖...");
		}
		catch(ArithmeticException e3) {
			System.out.println("Arithmetic Exception");
			System.out.println("바깥 catch문1");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("바깥 catch문2");
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("바깥 catch문3");
		}
	}
}
