package ������;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadA1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		ReadWriteLock lock = new ReentrantReadWriteLock();
		
		ThreadB1 newThread1 = new ThreadB1(lock, map);
		ThreadB1 newThread2 = new ThreadB1(lock, map);
		newThread1.start();
		newThread2.start();
		lock.writeLock().lock();
		System.out.println("����� �� ȹ��...");
		try {
			map.put("�̸�", "����");
		}finally {
			System.out.println("����� �� �絵...");
			lock.writeLock().unlock();
		}

	}
}
class ThreadB1 extends Thread{
	ReadWriteLock lock;
	Map<String, String> map;
	public ThreadB1(ReadWriteLock lock, Map<String, String> map) {
		this.lock = lock;
		this.map = map;
	}
	@Override
	public void run() {
		lock.readLock().lock();
		System.out.println("�б�� �� ȹ��...");
		try {
			System.out.println(map.get("�̸�"));
			sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("�б�� �� �絵...");
			lock.readLock().unlock();
		}
	}
}
