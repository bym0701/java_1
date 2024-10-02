package 박유민;

public class ExceptionDemo {
	public static void main(String[] args) {
		ExceptionDemo app = new ExceptionDemo();
		try {
			app.method1();
		}
		catch(ArithmeticException e) {
			System.out.println("첫 번째 catch문 실행" + e.toString());
		}
		catch(Exception e) {
			System.out.println("두 번째 catch문 실행");
		}
		finally {
			System.out.println("finally block 실행");
		}
		
	}
	private void method1() {
		System.out.println("try문 실행");
		throw new ArithmeticException();
	}
}
