package ������;

public class LogicOperation {
	public static void main(String[] args) {
		
		int x = 3, y = 9;
		
		System.out.println("�� AND �׽�Ʈ");
		System.out.println( (x < y) + "," + (x > 0) + ":" + (x < y && x > 0));
		System.out.println( (x > y) + "," + (x > 0) + ":" + (x > y && x > 0));
		System.out.println( (x < y) + "," + (x < 0) + ":" + (x < y && x < 0));
		System.out.println( (x > y) + "," + (x < 0) + ":" + (x > y && x < 0));
		
		System.out.println("�� OR �׽�Ʈ");
		System.out.println( (x < y) + "," + (x > 0) + ":" + (x < y || x > 0));
		System.out.println( (x > y) + "," + (x > 0) + ":" + (x > y || x > 0));
		System.out.println( (x < y) + "," + (x < 0) + ":" + (x < y || x < 0));
		System.out.println( (x > y) + "," + (x < 0) + ":" + (x > y || x < 0));
		
		System.out.println("�� XOR �׽�Ʈ");
		System.out.println( (x < y) + "," + (x > 0) + ":" + (x < y ^ x > 0));
		System.out.println( (x > y) + "," + (x > 0) + ":" + (x > y ^ x > 0));
		System.out.println( (x < y) + "," + (x < 0) + ":" + (x < y ^ x < 0));
		System.out.println( (x > y) + "," + (x < 0) + ":" + (x > y ^ x < 0));
		
		System.out.println("�� NOT �׽�Ʈ");
		System.out.println( (x < y) + ":" + !(x < y));
		System.out.println( (x > y) + ":" + !(x > y));

		
	}
}
