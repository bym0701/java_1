package ������;

public class ThreadDemo extends Thread{
/*	public static void main(String[] args) {
		PrintThread T1 = new PrintThread("������ A");
		PrintThread T2 = new PrintThread("������ B");
		
		T1.start();
		T2.start();
		
		try {
			T1.join();
			T2.join();
		}catch(Exception e) {
			System.out.println("���ͷ�Ʈ �ɸ�");
		}
	}
}
class PrintThread extends Thread{
	private String threadName;
	
	PrintThread(String name){
		threadName = name;
	}
	public void run() {
		printCount();
		System.out.println("������ " + threadName + " ����");
	}
	public void printCount() {
		try {
			for(int i = 10; i > 0;i--) {
				System.out.println(threadName + " : Counter  ---  " + i);
			}
		}catch(Exception e) {
			System.out.println(threadName + " : ������ ���ͷ�Ʈ ��");
		}
	} */
	public static void main(String[] args) {
		Object sharedObj = new Object();
		PrintThread T1 = new PrintThread("������ A", sharedObj);
		PrintThread T2 = new PrintThread("������ B", sharedObj);
		
		T1.start();
		T2.start();
		
		try {
			T1.join();
			T2.join();
		}catch(Exception e) {
			System.out.println("���ͷ�Ʈ ��");
		}
	}
}
	class PrintThread extends Thread{
		private String threadName;
		private Object sharedObject;
	
		PrintThread(String name, Object shared){
			threadName = name;
			sharedObject = shared;
		}
		public void run() {
			synchronized (sharedObject) {
				printCount();
			} 
			System.out.println("������ " + threadName + " ����");
		}
	public void printCount() {
		try {
			for(int i = 10; i > 0; i--) {
				System.out.println(threadName + " : Counter  ---  " + i);
			}
		}catch(Exception e) {
			System.out.println(threadName + " : ������ �����");
		}
	}
}