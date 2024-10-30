package ������;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	public static void main(String[] args) {
		final int numOfThreads = 10;
		final int numOfpermits = 1;
		Semaphore semaphore = new Semaphore(numOfpermits, true);
		ThreadB2 threads[] = new ThreadB2[numOfThreads];
		for(int i = 0; i < numOfThreads; i++) {
			threads[i] = new ThreadB2(semaphore, "Thread " + i);
			threads[i].start();
		}
	}
}
class ThreadB2 extends Thread{
	String threadName;
	Semaphore semaphore;
	
	public ThreadB2(Semaphore semaphore, String name) {
		this.semaphore = semaphore;
		threadName = name;
	}
	public void run() {
		try {
			semaphore.acquire();
			System.out.println(threadName + " ������ ȹ�� ...");
			System.out.println(threadName + " �۾� �� ...");
			Thread.sleep(2000);
			System.out.println(threadName + " �۾� ���� ...");
			System.out.println(threadName + " ������ �絵 ...");
			semaphore.release();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}