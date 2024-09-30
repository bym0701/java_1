package Test;

public class Inheritance_Flower {
	public static void main(String[] args) {
		Flower Flower = new Flower();
		Rose Rose = new Rose();
		Tulip Tulip = new Tulip();
		
		Flower.printAttributes();
		Rose.printAttributes();
		Tulip.printAttributes();
	
	}
}
class Flower{
	public String Flowername;
	public int cost;
	public Flower() {
		Flowername = "²É";
		cost = 10000;
	}
	protected void printAttributes() {
		System.out.println("Flowername = " + Flowername + "\tcost = " + cost);
	}
}
class Rose extends Flower{
	public Rose() {
		Flowername = "Àå¹Ì";
		cost = 20000;
	}
}
class Tulip extends Flower{
	public Tulip() {
		Flowername = "Æ«¸³";
		cost = 30000;
	}
}