package ¹ÚÀ¯¹Î;

public class Example_405 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("Test Thread");
		t.setPriority(1);
		int p = t.getPriority();
		
		System.out.println(t.getName() + " : " + p);
	}
}
