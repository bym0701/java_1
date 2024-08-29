package 박유민;

public class SharedTest_constructor {
	public static void main(String[] args) {
		SharedData shareddata = new SharedData();
		A ob1 = new A(shareddata);
		ob1.updateData();
		B ob2 = new B(shareddata);
		ob2.readData();
	}
}
/*
class SharedData{
	private int sharedVariable;
	public final int sharedConstant = 100;
	public int getSharedVariable() {return sharedVariable;}
	public void setSharedVariable(int s) {sharedVariable = s;}
}
*/
class A{
	SharedData shareddata;
	public A(SharedData shareddata) {this.shareddata = shareddata;}
	public void updateData() {
		System.out.println("상수 : "+ shareddata.sharedConstant);
		shareddata.setSharedVariable(5);
	}
}

class B{
	SharedData shareddata;
	public B(SharedData shareddata) {this.shareddata = shareddata;}
	public void readData() {
		System.out.println("상수 : " + shareddata.sharedConstant);
		System.out.println(shareddata.getSharedVariable());
	}
}