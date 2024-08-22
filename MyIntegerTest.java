package ¹ÚÀ¯¹Î;

public class MyIntegerTest {
	public static void main(String[] args) {
		
		MyInteger1 ob = new MyInteger1();
		int x = ob.add(5);
		double y = ob.add(3.5);
		System.out.println(x + ", " + y);
		

		int z = ob.add(ob);
		
		
	}
}
class MyInteger1{
	int val;
	
	int add(MyInteger1 ob) {
		System.out.println("Hello");
		return this.val + ob.val;
		}
	int add(int i) {return this.val + i;}
	double add(double d) {return this.val + d;}
	int subtract(MyInteger1 ob) {return this.val - ob.val;}
	int multiply(MyInteger1 ob) {return this.val * ob.val;}
	double divide(MyInteger1 ob) {return ((double) this.val)/ob.val;}
}