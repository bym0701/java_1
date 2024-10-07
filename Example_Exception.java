package 박유민;

public class Example_Exception {
	public static void main(String[] args) {
		/*try {
			String arr[] = {"a", "b", "c", "d", "e"};
			
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스의 범위를 벗어나 접근했습니다. 수정바랍니다.");
		}
	 	try {
			int n = Integer.parseInt("XYZ");
			System.out.println(n);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가능한 문자열이 parseInt 메서드의 인수로 주어졌습니다.");
		}
		
		try {
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}*/
		
		try {
			throw new NullNameException();
		}
		catch(NullNameException e) {
			System.out.println("사용자 정의 예외 발생");
			System.out.println(e);
		}
		try {
			throw new CountZeroException("hoho");
		}catch(CountZeroException e) {
			System.out.println(e);
		}
	}
}
class NullNameException extends Exception{
	public String toString() {
		return("이름 미지정");
	}
}
class CountZeroException extends Exception{
	public CountZeroException() {};
	public CountZeroException(String message) {
		super(message);
	}
}