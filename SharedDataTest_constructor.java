package ������;

import java.util.Random;

public class SharedDataTest_constructor {
	public static void main(String[] args) {
		SharedData buf = new SharedData();
		Consumer c = new Consumer(buf);
		Producer p = new Producer(buf);
		
		for(int i = 0; i < 3; i++) {
			p.produce();
			c.consume();
		}
	}
}
class SharedData{
	private int count = 0;
	public final int MaxSize = 100;
	private int[] buffer = new int[MaxSize];
	public int getVal() {
		if(count != 0) return buffer[--count];
		else return -1;
	}
	public int setVal(int s) {
		if(count != MaxSize) {
			buffer[count++] = s;
			return count;
		}
		else return -1;
	}
}
class Producer{
	private Random generator = new Random();
	private SharedData buffer;
	public Producer(SharedData s) {
		buffer = s;
	}
	public void produce() {
		int loop = generator.nextInt(4) + 2;
		int res, val;
		for(int i = 0; i < loop; i++) {
			val = generator.nextInt(101);
			res = buffer.setVal(val);
			if(res < 0) System.out.println("write : ���۰� �� �� �����͸� �߰��� �� �����ϴ�.");
			else System.out.println("write : " + val);
		}
	}
}
class Consumer{
	private Random generator = new Random();
	private SharedData buffer;
	public Consumer(SharedData s) {
		buffer = s;
	}
	public void consume() {
		int loop = generator.nextInt(4) + 2;
		int res;
		for(int i = 0; i < loop; i++) {
			res = buffer.getVal();
			if(res < 0) System.out.println("read : �����Ͱ� �����ϴ�.");
			else System.out.println("read : " + res);
		}
	}
}