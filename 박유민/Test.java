package 박유민;

public class Test {
	public static void main(String args[]) {
		String regExp = "01[078]-\\d{4}-\\d{4}"; //010 or 017 or 018 - 4자리 - 4자리
		
		String Str = new String("010-5182-0173");
		System.out.println(Str.matches(regExp));
		
		Str = new String("013-5182-0173");
		System.out.println(Str.matches(regExp));
		
		Str = new String("013-518-0173");
		System.out.println(Str.matches(regExp)); //문자열이 특정 패턴에 부합되는지, 특정 패턴에 해당하는 부분 문자열을 포함하는지
	}
}
