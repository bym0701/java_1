package 박유민;

import java.util.Random;

public class SharedDataTest {
	public static void main(String[] args) {

		Consumer c = new Consumer();  // 1
		Producer p = new Producer();  // 2

		for(int i = 0; i < 3; i++) {  // 3 30
			p.produce();              // 4
			c.consume();              // 18
		}
	}
}

class SharedData{
	private static int count = 0; 
	public final static int MaxSize = 100; 
	private static int[] buffer = new int[MaxSize]; 

	public static int getVal() {           // 24
		if(count != 0)                     // 25
			return buffer[--count];        // 26
		else return -1;                     // 26
	}
	
	public static int setVal(int s) {      // 11
		if(count != MaxSize) {             // 12
			buffer[count++] = s;           // 13
			return count;                  // 14
		}
		else return -1;                    // 13
	}
}

class Producer{
	private Random generator = new Random(); 
	public void produce() {                  // 5
		int loop = generator.nextInt(4) + 2; // 6
		int res, val; // 7
		for(int i = 0; i < loop; i++) {      // 8 17
			val = generator.nextInt(101);    // 9
			res = SharedData.setVal(val);    // 10
			if(res < 0) //15
				System.out.println("write : 버퍼가 꽉 찬 데이터를 추가할 수 없습니다."); // 16
			else System.out.println("write : " + val); //16
		}
	}
}

class Consumer{
	private Random generator = new Random(); 
	public void consume() {                  // 19
		int loop = generator.nextInt(4) + 2; // 20
		int res; // 21
		for(int i = 0; i < loop; i++) {      // 22 29
			res = SharedData.getVal();       // 23
			if(res < 0) //27
				System.out.println("read : 데이터가 없습니다."); // 28
			else System.out.println("read : " + res); // 28
		}
	}
}