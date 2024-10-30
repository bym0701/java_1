package ������;

public class ThreadA {
/*	public static void main(String[] args) {
		ThreadB newThread = new ThreadB();
		newThread.start();
		
		synchronized(newThread) {
			try {
				System.out.println("�� �����尡 ��ĥ ������ ��� ��...");
				newThread.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� : " + newThread.total);
		}
	} */
/*	public static void main(String[] args) throws InterruptedException{
		ThreadB newThread = new ThreadB();
		newThread.start();
		
		Thread.sleep(100);
		synchronized(newThread){
			try {
				System.out.println("�� �����尡 ��ĥ ������ ��� ��...");
				newThread.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� : " + newThread.total);
		}
	} */
	public static void main(String[] args) throws InterruptedException{
		ThreadB newThread = new ThreadB();
		newThread.start();
		
		Thread.sleep(100);
		synchronized(newThread) {
			try {
				System.out.println("�� �����带 ��ĥ ������ ��� ��...");
				while(!newThread.active) newThread.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� : " + newThread.total);
		}
	}
}
/*
class ThreadB extends Thread{
	int total;
	@Override
	public void run() {
		synchronized(this) {
			for(int i = 0; i < 100; i++) {
				total += i;
			}
			notify();
		}
	}
} */
class ThreadB extends Thread{
	int total;
	boolean active = false;
	@Override
	public void run() {
		synchronized(this) {
			for(int i = 0; i < 100; i++) {
				total += i;
			}
			active = true;
			notify();
		}
	}
}