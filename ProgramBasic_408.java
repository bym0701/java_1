package 박유민;

public class ProgramBasic_408 {
	public static void main(String[] args) {
		ThreadExample1 t1 = new ThreadExample1("스레드 A");
		t1.start();
		
		ThreadExample1 t2 = new ThreadExample1("스레드 B");
		t2.start();
	}
}
class ThreadExample1 extends Thread{
	public ThreadExample1(String name) {super.setName(name);}
	public void run() {
		System.out.println("스레드 실행 : " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName() + " 종료될 때 까지 1초가 소요됩니다. 기다려주세요...");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("스레드 종료 : " + Thread.currentThread().getName());
	}
}