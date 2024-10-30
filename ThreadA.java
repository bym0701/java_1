package 박유민;

public class ThreadA {
/*	public static void main(String[] args) {
		ThreadB newThread = new ThreadB();
		newThread.start();
		
		synchronized(newThread) {
			try {
				System.out.println("새 스레드가 마칠 때까지 대기 중...");
				newThread.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("총합 : " + newThread.total);
		}
	} */
/*	public static void main(String[] args) throws InterruptedException{
		ThreadB newThread = new ThreadB();
		newThread.start();
		
		Thread.sleep(100);
		synchronized(newThread){
			try {
				System.out.println("새 스레드가 마칠 때까지 대기 중...");
				newThread.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("총합 : " + newThread.total);
		}
	} */
	public static void main(String[] args) throws InterruptedException{
		ThreadB newThread = new ThreadB();
		newThread.start();
		
		Thread.sleep(100);
		synchronized(newThread) {
			try {
				System.out.println("새 스레드를 마칠 때까지 대기 중...");
				while(!newThread.active) newThread.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("총합 : " + newThread.total);
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