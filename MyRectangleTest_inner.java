package 박유민;

public class MyRectangleTest_inner {
	public static void main(String[] args) {
		MyRectangle1 r1 = new MyRectangle1();
		r1.setX(10); r1.setY(10); r1.setWidth(5); r1.setHeight(4);
		System.out.println("면적은 " + r1.getArea() + "입니다.");
		
	//	MyRectangle1.MyPoint p = r1.new MyPoint();
		MyPoint p = new MyPoint();
		p.setX(3); p.setY(5);
		System.out.println(p.getX() + ", " + p.getY());
	}
}	

/*
class MyRectangle1{
	private MyPoint corner = new MyPoint();
	private int width, height;
	
	public int getX() {return corner.x;}
	public void setX(int newX) {corner.x = newX;}
	public int getY() {return corner.y;}
	public void setY(int newY) {corner.y = newY;}
	public int getWidth() {return width;}
	public void setWidth(int newW) {width = newW;}
	public int getHeight() {return height;}
	public void setHeight(int newH) {height = newH;}
	public void resize(int newW, int newH) {width = newW; height = newH;}
	public int getArea() {return width * height;}
	
	class MyPoint{
		private int x, y;
		public int getX() {return x;}
		public void setX(int newX) {x = newX;}
		public int getY() {return y;}
		public void setY(int newY) {y = newY;}
	}
} */

class MyRectangle1{
	private MyPoint corner = new MyPoint();
	private int width, height;
	
	public int getX() {return corner.getX();}
	public void setX(int newX) {corner.setX(newX);}
	public int getY() {return corner.getY();}
	public void setY(int newY) {corner.setY(newY);}
	public int getWidth() {return width;}
	public void setWidth(int newW) {width = newW;}
	public int getHeight() {return height;}
	public void setHeight(int newY) {height = newY;}
	public void resize(int newW, int newH) {width = newW; height = newH;}
	public int getArea() {return width * height;}
}

class MyPoint{
	private int x, y;
	public int getX() {return x;}
	public void setX(int newX) {x = newX;}
	public int getY() {return y;}
	public void setY(int newY) {y = newY;}
}
