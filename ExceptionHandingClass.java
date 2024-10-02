package 박유민;

public class ExceptionHandingClass {
	public static void main(String[] args) {
		try {
			System.out.println("try문 실행");
			throw new ArithmeticException();
		}
		catch(ArithmeticException e){
			System.out.println("첫 번째 catch문 실행" + e.toString());
		}
		catch(Exception e) {
			System.out.println("두 번째 catch문 실행");
		}
		finally {
			System.out.println("finally block 실행");
		}
	}
}
