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
		System.out.println("�ڵ��� ũ�� : " + CARSIZE1);
	}
	@Override
	public void price() {
		System.out.println("�ְ� ���� : " + cost + "����");
	}
	public void option() {
		System.out.println("Ǯ�ɼ� ���� = " + option + "����");
	}
	public void discount() {
		System.out.println("���� ��ü = " + discount +"���� ����");
	}
	public void maker() {
		System.out.println("������ : " + KIA);
	}
}

class Sonata extends CarTransfer implements Car, CarMaker{
	private int cost, option, discount;
	@Override
	public void size() {
		System.out.println("�ڵ��� ũ�� : " + CARSIZE2);
	}
	@Override
	public void price() {
		System.out.println("�ְ� ���� : " + cost + "����");
	}
	public void option() {
		System.out.println("Ǯ�ɼ� ���� = " + option + "����");
	}
	public void discount() {
		System.out.println("���� ��ü = " + discount +"���� ����");
	}
	public void maker() {
		System.out.println("������ : " + HYUNDAI);
	}
}

interface CarMaker{
	public final static String KIA = "����ڵ���";
	public final static String HYUNDAI = "�����ڵ���";
	
	public abstract void maker();
}

class CarTransfer {
	public void prideCost() {
		System.out.println("�����̵� ��ۺ� = 5����");
	}
	public void sonataCost() {
		System.out.println("�ҳ�Ÿ ��ۺ� = 10����");
	}
}
