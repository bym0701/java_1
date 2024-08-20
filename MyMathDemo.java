package ������;

import java.util.Scanner;

public class MyMathDemo {
	public static void main(String[] args) {
		
		System.out.println("�������� �Է��ϼ���. : ");
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		System.out.println("���� �ѷ� : " + MyMath.getCirclePerimeter(r));
		System.out.println("���� ���� : " + MyMath.getCircleArea(r));
		
		System.out.println("������ �Է��ϼ���. : ");
		r = sc.nextDouble();
		System.out.println(MyMath.mileToKilometer(r) + "ų�ι��Ϳ� �ش��մϴ�.");
		
		System.out.println("ų�ι��͸� �Է��ϼ���. : ");
		r = sc.nextDouble();
		System.out.println(MyMath.kilometerToMile(r) + "���Ͽ� �ش��մϴ�.");
		
	}
}
class MyMath{
	static final double PI = 3.14159;
	static final double KMPerMILE = 1.609344;
	
	static double getCirclePerimeter(double r) {return 2*PI*r;}
	static double getCircleArea(double r) {return PI*r*r;}
	static double kilometerToMile(double km) {return km * 1/KMPerMILE;}
	static double mileToKilometer(double m) {return m * KMPerMILE;}
}