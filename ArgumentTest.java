package ¹ÚÀ¯¹Î;

public class ArgumentTest {
	public static void main(String[] args) {
		int x = 3, y = 5;
		MyInteger2 ob1 = new MyInteger2(), ob2 = new MyInteger2();
		
		swap(x, y);
		System.out.println("x = " + x + ", " + "y = " + y);
		ob1.setVal(3); ob2.setVal(5);
		swap(ob1, ob2);
		System.out.println("ob1 = " + ob1.getVal() + ", " + "ob2 = " + ob2.getVal());
	}
	
	public static void swap(int x, int y) {
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
	}
	
	public static void swap(MyInteger2 x, MyInteger2 y) { 
		int tmp;
		
		tmp = x.getVal();
		x.setVal(y.getVal());
		y.setVal(tmp);
	}
}
class MyInteger2{
	private int x;
	
	int getVal() {return x;}
	void setVal(int val) {x = val;}
}

