package ¹ÚÀ¯¹Î;

public class MyApp_181 {
	public static void main(String[] args) {
	/*	StaticTest ob1 = new StaticTest();
		StaticTest ob2 = new StaticTest();
		
		ob1.setValue(3);
		System.out.println(ob2.getValue());
		
		ob1.setInstVal(5);
		System.out.println(ob2.getInstVal());
	*/
		
		StaticTest.setValue(3);
		System.out.println(StaticTest.getValue());
		
		StaticTest ob1 = new StaticTest();
		StaticTest ob2 = new StaticTest();
		
		ob1.setInstVal(5);
		System.out.println(ob2.getInstVal());
		
	}
}

/*//p.181
class StaticTest{
	static int value;
	int instVal;
	void setValue(int n) {value = n;}
	int getValue() {return value;}
	void setInstVal (int n) {instVal = n;}
	int getInstVal() {return instVal;}
}
*/

//p.185
class StaticTest{
	static int value;
	int instVal;
	static void setValue(int n) {value = n;}
	static int getValue() {return value;}
	void setInstVal (int n) {instVal = n;}
	int getInstVal() {return instVal;}
}