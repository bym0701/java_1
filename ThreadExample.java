package ������;

import java.util.Scanner;

public class ThreadExample implements Runnable{
	public static void main(String[] args) throws InterruptedException{
		System.out.println("�� ������ �����մϴ�.");
		
		Thread t = new Thread(new ThreadExample());
		t.start();
		System.out.println("�ڽ� ������ �����մϴ�.");
		
		System.out.println("�� ������ ��ٸ��ϴ�.");
		t.join();
		System.out.print("�� ������ �ٽ� �����մϴ�.");
	}
	public void run() {
		System.out.println("���� �Է��� ��ٸ��� �ֽ��ϴ�. �Է� �ٶ��ϴ�. >> ");
		Scanner s = new Scanner(System.in);
		
		int val = s.nextInt();
		
		System.out.println("�ڽ� ������ �����մϴ�.");
	}
}

class InterruptingThreadTest1 extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("��� ���¿��� ���");
		}
		catch(InterruptedException e) {
			System.out.println("���ͷ�Ʈ �߻� " + e);
		}
	}
	public static void main(String[] args) {
		InterruptingThreadTest1 t1 = new InterruptingThreadTest1();
		
		t1.start();
		t1.interrupt();
	}
}
