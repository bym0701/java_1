package 박유민;

import java.util.Random;

public class SharedDataTest {
	public static void main(String[] args) {
		
		Consumer c = new Consumer();//1
		Producer p = new Producer();//2
		
		for(int i = 0; i < 3; i++) {
			p.produce();
			c.consume();
		}
	}
}

class SharedData{
	private static int count = 0;
	public final static int MaxSize = 100;
	private static int[] buffer = new int[MaxSize];
	
	public static int getVal() {
		if(count != 0) //11
			return buffer[--count];//12
		else //12
			return -1;//13
		//13
	}
	public static int setVal(int s) {
		if(count != MaxSize) {
			buffer[count++] = s;
			return count;
		}
		else return -1;
	}
}

class Producer{
	private Random generator = new Random();
	public void produce() {
		int loop = generator.nextInt(4) + 2;
		int res, val;
		for(int i = 0; i < loop; i++) {
			val = generator.nextInt(101);
			res = SharedData.setVal(val);
			if(res < 0) System.out.println("write : 버퍼가 꽉 찬 데이터를 추가할 수 없습니다.");
			else System.out.println("write : " + val);
		}
		
	}
}

class Consumer{
	private Random generator = new Random();
	public void consume() {
		int loop = generator.nextInt(4) + 2;
		int res;
		for(int i = 0; i < loop; i++) {
			res = SharedData.getVal();
			if(res < 0) System.out.println("read : 데이터가 없습니다.");
			else System.out.println("read : " + res);
		}
	}
}