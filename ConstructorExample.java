package 박유민;

public class ConstructorExample {
	public static void main(String[] args) throws Throwable{
		Cat c = new Cat("이쁜이", 45);
		Cat c2 = new Cat();
		System.out.println(c.toString() + "의 몸무게는 " + c.getSize());	
		System.out.println(c2.toString() + "의 몸무게는 " + c2.getSize());
		
		c.finalize();
		c2.finalize();
	}
}
class Cat{
	int size;
	String name;

	public Cat() {
		this("영순이", 50);
		
	}
	public Cat(String n, int s) {
		this.name = n;
		this.size = s;
	}
	public int getSize() {return size;}
	public String toString() {return name;}
	public void finalize() throws Throwable{
		System.out.println(name + " 고양이가 소멸됨");
	}
}