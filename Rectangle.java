package Test;

public class Rectangle extends Shape{
	int w, h;
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	void calcArea() {
		area = w*h;
	}
	
	@Override
	void calcAround() {
		around = 2*(w+h);
	}
}
