package 박유민;
/*
public class AnonymousTest {
	public static void main(String[] args) {
		MyClass inner = new MyClass();
		inner.test();
	}
}
interface MyInterface{
	public void test();
}
class MyClass implements MyInterface{
	public void test() {
		System.out.println("테스트입니다.");
	}
}
*/
public class AnonymousTest {
	public static void main(String[] args) {
		MyInterface inner = new MyInterface() {
			public void test() {
				System.out.println("테스트입니다.");
			}
		};
		inner.test();
	}
}
interface MyInterface{
	public void test();
}

