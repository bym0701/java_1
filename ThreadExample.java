package 박유민;

import java.util.Scanner;

public class ThreadExample implements Runnable{
	public static void main(String[] args) throws InterruptedException{
		System.out.println("주 스레드 시작합니다.");
		
		Thread t = new Thread(new ThreadExample());
		t.start();
		System.out.println("자식 스레드 시작합니다.");
		
		System.out.println("주 스레드 기다립니다.");
		t.join();
		System.out.print("주 스레드 다시 시작합니다.");
	}
	public void run() {
		System.out.println("정수 입력을 기다리고 있습니다. 입력 바랍니다. >> ");
		Scanner s = new Scanner(System.in);
		
		int val = s.nextInt();
		
		System.out.println("자식 스레드 종료합니다.");
	}
}

class InterruptingThreadTest1 extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("잠든 상태에서 벗어남");
		}
		catch(InterruptedException e) {
			System.out.println("인터럽트 발생 " + e);
		}
	}
	public static void main(String[] args) {
		InterruptingThreadTest1 t1 = new InterruptingThreadTest1();
		
		t1.start();
		t1.interrupt();
	}
}
