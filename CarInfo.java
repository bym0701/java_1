package Test;

import java.util.Scanner;

public class CarInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====Pride=====");
		System.out.println("�ְ� ����, Ǯ�ɼ� ����, ���� ��ü ���� ����, ��ۺ� :");
		int price = sc.nextInt();
		int option = sc.nextInt();
		int discount = sc.nextInt();
		int cost = sc.nextInt();
		Pride pr = new Pride(price, option, discount, cost);
		pr.size();
		pr.price();
		pr.option();
		pr.discount();
		pr.maker();
		pr.prideCost();
		
		System.out.println("=====Sonata=====");
		System.out.println("�ְ� ����, Ǯ�ɼ� ����, ���� ��ü ���� ����, ��ۺ� :");
		price = sc.nextInt();
		option = sc.nextInt();
		discount = sc.nextInt();
		cost = sc.nextInt();
		Sonata so = new Sonata(price, option, discount, cost);
		so.size();
		so.price();
		so.option();
		so.discount();
		so.maker();
		so.sonataCost();
		
	}
}
interface Car{
	public final static String CARSIZE1 = "small type";
	String CARSIZE2  = "middle type";
	
	public abstract void size();
	public abstract void price();
	void option();
}

interface CarMaker{
	public final static String KIA = "����ڵ���";
	public final static String HYUNDAI = "�����ڵ���";
	
	public abstract void maker();
}

abstract class CarTransfer implements Car, CarMaker{
	int price, option, discount, cost; 
	
	public void price() {
		System.out.println("�ְ� ���� : " + price + "����");
	}
	public void option() {
		System.out.println("Ǯ�ɼ� ���� = " + option + "����");
	}
	public void discount() {
		System.out.println("���� ��ü = " + discount +"���� ����");
	}
}

class Pride extends CarTransfer {
	public Pride(int price, int option, int discount, int cost) {
		this.price = price;
		this.option = option;
		this.discount = discount;
		this.cost = cost;
	}
	public void size() {
		System.out.println("�ڵ��� ũ�� : " + CARSIZE1);
	}
	public void maker() {
		System.out.println("������ : " + KIA);
	}
	public void prideCost() {
		System.out.println("�����̵� ��ۺ� = " + cost + "����");
	}
}

class Sonata extends CarTransfer {
	public Sonata(int price, int option, int discount, int cost) {
		this.price = price;
		this.option = option;
		this.discount = discount;
		this.cost = cost;
	}
	public void size() {
		System.out.println("�ڵ��� ũ�� : " + CARSIZE2);
	}
	public void maker() {
		System.out.println("������ : " + HYUNDAI);
	}
	public void sonataCost() {
		System.out.println("�ҳ�Ÿ ��ۺ� = " + cost + "����");
	}
}