package ������;

public class ProgramBasic_408 {
	public static void main(String[] args) {
		ThreadExample1 t1 = new ThreadExample1("������ A");
		t1.start();
		
		ThreadExample1 t2 = new ThreadExample1("������ B");
		t2.start();
	}
}
class ThreadExample1 extends Thread{
	public ThreadExample1(String name) {super.setName(name);}
	public void run() {
		System.out.println("������ ���� : " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName() + " ����� �� ���� 1�ʰ� �ҿ�˴ϴ�. ��ٷ��ּ���...");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ ���� : " + Thread.currentThread().getName());
	}
}