package ¹ÚÀ¯¹Î;

public class VariableScopeTest {
	public static void main(String[] args) {
		
		VariableScope app = new VariableScope();
		int y = app.method1();
		app.method2(y);
	}
}

class VariableScope {
	int x = 3;
	//int y = 5;
	
	public int method1() {
		int y = 5;
		System.out.println("x = " + x + "y = " + y);
		return y;
	}
	public void method2(int y) {
		System.out.println("x = " + x + "y = " + y);
		for(int z = 0; z < 3; z++) System.out.println("z = " + z);
	//	System.out.println("z = " + z);
	}
}
