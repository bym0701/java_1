package ������;

public class MyApp {
	public static void main(String[] args) {
		MyInteger ob1 = new MyInteger(), ob2 = new MyInteger(), ob3 = new MyInteger();
		ob1.val = 3; ob2.val = 5; ob3.val = 10;
		
		int x = ob1.add(ob3);
		System.out.println("���1 : " + x);
		int y = ob2.add(ob3);
		System.out.println("���2 : " + y);
		
		
	}
}
