package 박유민;

public class MyRectangleTest {
	public static void main(String[] args) {
		MyRectangle r1 = new MyRectangle();
		r1.setX(10); r1.setY(10); r1.setWidth(5); r1.setHeight(4);
		System.out.println("면적은 " + r1.getArea() + "입니다.");
	}
}
