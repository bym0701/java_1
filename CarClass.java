package ������;

public class CarClass {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setSpeed(80);
		myCar.honk();
		System.out.println("���� �ӵ��� " + myCar.getSpeed());
		
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
		System.out.println("����!");
	}
}