package 박유민;

public class SharedTest {
/*	
class SharedData{
	private static int sharedVariable;
	public final static int sharedConstant = 100;
	public static int getSharedVariable() {return sharedVariable;}
	public static void setSharedVariable(int s) {sharedVariable = s;}
}

class A{
	public void updateData() {
		System.out.println("상수 : " + SharedData.sharedConstant);
		SharedData.setSharedVariable(5);
	}
}
class B{
	public void readData() {
		System.out.println("상수 : " + SharedData.sharedConstant);
		System.out.println(SharedData.getSharedVariable());
	}
}

	public static void main(String[] args) {
		A ob1 = new A();
		ob1.updateData();
		B ob2 = new B();
		ob2.readData();
	} */
	
	private int sharedVariable;
	public final int sharedConstant = 100;
	
	public static void main(String[] args) {
		SharedTest app = new SharedTest();
		SharedTest.A ob1 = app.new A();
		ob1.updateData();
		SharedTest.B ob2 = app.new B();
		ob2.readData();
	}
	
	class A {
		public void updateData() {
			System.out.println("상수 : " + sharedConstant);
			sharedVariable = 5;
		}
	}
	
	class B {
		public void readData() {
			System.out.println("상수 : " + sharedConstant);
			System.out.println(sharedVariable);
		}
	}
} 
