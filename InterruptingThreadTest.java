package 박유민;

public class InterruptingThreadTest extends Thread{
	public InterruptingThreadTest(String s) {super.setName(s);}
	
	public void run() {
		for(int i = 1; i <= 2; i++) {
			if(Thread.interrupted()) {
				System.out.println(Thread.currentThread().getName() + "code for interrupted thread");
			}else {
				System.out.println(Thread.currentThread().getName() + "code for normal thread");
			}
		}
	}
	public static void main(String[] args) {
		InterruptingThreadTest t1 = new InterruptingThreadTest("A");
		InterruptingThreadTest t2 = new InterruptingThreadTest("B");
		t1.start();
		t2.start();
		t1.interrupt();
		if(t1.isInterrupted()) System.out.println("인터럽티드 플래그 설정되어 있음");
	}
}
