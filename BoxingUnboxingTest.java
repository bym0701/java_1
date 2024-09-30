package ¹ÚÀ¯¹Î;

public class BoxingUnboxingTest {
	public static void main(String[] args) {
		
		int val = 30;
		Integer iOb = Integer.valueOf(val); //boxing
		Integer jOb = val; //autoboxing
		
		System.out.println(val + " " + iOb + " " + jOb);
		
		Integer ob = new Integer(5);
		int i = ob.intValue(); //unboxing
		int j = ob; //autounboxing
		
		System.out.println(ob + " " + i + " " + j);
	}
}
