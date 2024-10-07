package 박유민;

public class NestTryTest {
	public static void main(String[] args) {
		try { //1
			try { //2
				System.out.println("내부 try 블록1"); //3
				int b = 5/0; //4
				System.out.println(b); 
			}
			catch(ArithmeticException e1) { //5
				System.out.println("내부 catch문1"); //6
			}
			try { //7
				System.out.println("내부 try 블록2"); //8
				int b = 5/0; //9
				System.out.println(b);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("내부 catch문2");
			}
			System.out.println("내부 try-catch문 블록 밖...");
		}
		catch(ArithmeticException e3) { //10
			System.out.println("Arithmetic Exception"); //11
			System.out.println("바깥 catch문1"); //12
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("바깥 catch문2");
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("바깥 catch문3");
		}
		System.out.println("바깥 try-catch 블록 밖..."); //13
	}	
}
