package ¹ÚÀ¯¹Î;

public class CarClass {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setSpeed(80);
		myCar.honk();
		System.out.println("ÇöÀç ¼Óµµ´Â " + myCar.getSpeed());
		
	}
}
class Car{
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	public void honk() {
		System.out.println("»§»§!");
	}
}