package Test;

import java.util.Scanner;

public class CarInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====Pride=====");
		System.out.println("최고 가격, 풀옵션 가격, 구형 교체 할인 가격, 운송비 :");
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
		System.out.println("최고 가격, 풀옵션 가격, 구형 교체 할인 가격, 운송비 :");
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

class Pride extends CarTransfer implements Car, CarMaker{
	private int price, option, discount;
	@Override
	public void size() {
		System.out.println("자동차 크기 : " + CARSIZE1);
	}
	@Override
	public void price() {
		System.out.println("최고 가격 : " + price + "만원");
	}
	public void option() {
		System.out.println("풀옵션 가격 = " + option + "만원");
	}
	public void discount() {
		System.out.println("구형 교체 = " + discount +"만원 할인");
	}
	public void maker() {
		System.out.println("제조사 : " + KIA);
	}
	public Pride(int price, int option, int discount, int cost) {
		this.price = price;
		this.option = option;
		this.discount = discount;
		
	}
}

class Sonata extends CarTransfer implements Car, CarMaker{
	private int price, option, discount;
	@Override
	public void size() {
		System.out.println("자동차 크기 : " + CARSIZE2);
	}
	@Override
	public void price() {
		System.out.println("최고 가격 : " + price + "만원");
	}
	public void option() {
		System.out.println("풀옵션 가격 = " + option + "만원");
	}
	public void discount() {
		System.out.println("구형 교체 = " + discount +"만원 할인");
	}
	public void maker() {
		System.out.println("제조사 : " + HYUNDAI);
	}
	public Sonata(int price, int option, int discount, int cost) {
		this.price = price;
		this.option = option;
		this.discount = discount;
	}
}

interface CarMaker{
	public final static String KIA = "기아자동차";
	public final static String HYUNDAI = "현대자동차";
	
	public abstract void maker();
}

class CarTransfer {
	private int cost;
	public void prideCost() {
		System.out.println("프라이드 운송비 = " + cost + "만원");
	}
	public void sonataCost() {
		System.out.println("소나타 운송비 = " + cost + "만원");
	}

}
