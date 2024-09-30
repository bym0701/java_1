package Test;

public class Circle extends Shape{
	int r;
	public Circle(int r) {
		this.r = r;
	}
	
	void calcArea() {
		area = r*r*3.14;
	}
	
	@Override
	void calcAround() {
		around = 2*r*3.14;
	}
}
