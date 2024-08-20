package ¹ÚÀ¯¹Î;

public class FirstClass {
	int field1;
	
	public void method1() {
		field1 = 3;
	}
	public void method2() {
		System.out.println(field1);
	}
	public int getField1() {return field1;}
	public void setField1(int n) {field1 = n;}
	public static void main(String[] args) {
		
	}
	
}
class SecondClass{
	public void method3() {
		FirstClass ob = new FirstClass();
		
		ob.field1 = 3;
		
	}
}
