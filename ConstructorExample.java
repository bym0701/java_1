package ������;

public class ConstructorExample {
	public static void main(String[] args) throws Throwable{
		Cat c = new Cat("�̻���", 45);
		Cat c2 = new Cat();
		System.out.println(c.toString() + "�� �����Դ� " + c.getSize());	
		System.out.println(c2.toString() + "�� �����Դ� " + c2.getSize());
		
		c.finalize();
		c2.finalize();
	}
}
class Cat{
	int size;
	String name;

	public Cat() {
		this("������", 50);
		
	}
	public Cat(String n, int s) {
		this.name = n;
		this.size = s;
	}
	public int getSize() {return size;}
	public String toString() {return name;}
	public void finalize() throws Throwable{
		System.out.println(name + " ����̰� �Ҹ��");
	}
}