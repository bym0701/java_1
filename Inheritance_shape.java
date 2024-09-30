package Test;

public class Inheritance_shape {
	public static void main(String[] args) {
		Shape s1 = new Rectangle(1, 2);
		s1.calcArea();
		s1.calcAround();
		System.out.println("직사각형 : " + s1.area + ", " + s1.around);
		
		Shape s2 = new Circle(3);
		s2.calcArea();
		s2.calcAround();
		System.out.println("원 : " + s2.area + ", " + s2.around);
		
		Shape s3 = new Square(4);
		s3.calcArea();
		s3.calcAround();
		System.out.println("정사각형 : " + s3.area + ", " + s3.around);
		
	}
}
