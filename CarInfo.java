package Test;

public class CarInfo {
	public static void main(String[] args) {
		Pride pr = new Pride();
		pr.size();
		pr.price();
		pr.option();
		pr.discount();
		pr.maker();
		pr.prideCost();
		
		Sonata so = new Sonata();
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
	private int cost, option, discount;
	@Override
	public void size() {
		System.out.println("자동차 크기 : " + CARSIZE1);
	}
	@Override
	public void price() {
		System.out.println("최고 가격 : " + cost + "만원");
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
}

class Sonata extends CarTransfer implements Car, CarMaker{
	private int cost, option, discount;
	@Override
	public void size() {
		System.out.println("자동차 크기 : " + CARSIZE2);
	}
	@Override
	public void price() {
		System.out.println("최고 가격 : " + cost + "만원");
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
}

interface CarMaker{
	public final static String KIA = "기아자동차";
	public final static String HYUNDAI = "현대자동차";
	
	public abstract void maker();
}

class CarTransfer {
	public void prideCost() {
		System.out.println("프라이드 운송비 = 5만원");
	}
	public void sonataCost() {
		System.out.println("소나타 운송비 = 10만원");
	}
}
