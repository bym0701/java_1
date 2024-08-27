package workspace;

import java.util.Random;

public class SharedDataTest {
	public static void main(String[] args) {

		Consumer c = new Consumer();  // 4
		Producer p = new Producer();  // 5

		for(int i = 0; i < 3; i++) {  // 6
			p.produce();              // 7
			c.consume();              // 18
		}
	}
}

class SharedData{
	private static int count = 0; // 1    
	public final static int MaxSize = 100; // 2
	private static int[] buffer = new int[MaxSize]; //  3

	public static int getVal() {           // 22
		if(count != 0)                     // 23
			return buffer[--count];        // 24
		else // 24
			return -1;                     // 25
	}
	
	public static int setVal(int s) {      // 12
		if(count != MaxSize) {             // 13
			buffer[count++] = s;           // 14
			return count;                  // 15
		}
		else return -1;                    // 14
	}
}

class Producer{
	private Random generator = new Random(); // 4
	public void produce() {                  // 7
		int loop = generator.nextInt(4) + 2; // 8
		int res, val; // 9
		for(int i = 0; i < loop; i++) {      // 10
			val = generator.nextInt(101);    // 11
			res = SharedData.setVal(val);    // 12
			if(res < 0) //16
				System.out.println("write : 버퍼가 꽉 찬 데이터를 추가할 수 없습니다."); // 17
			else System.out.println("write : " + val); //17
		}
	}
}

class Consumer{
	private Random generator = new Random(); // 5
	public void consume() {                  // 18
		int loop = generator.nextInt(4) + 2; // 19
		int res; // 20
		for(int i = 0; i < loop; i++) {      // 21
			res = SharedData.getVal();       // 22
			if(res < 0) //26
				System.out.println("read : 데이터가 없습니다."); // 27
			else System.out.println("read : " + res); // 27
		}
	}
}
