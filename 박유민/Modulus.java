package ¹ÚÀ¯¹Î;

import java.util.Random;

public class Modulus {
	public static void main(String[] args) {
		int x, y;
		
		Random r = new Random();
		x = r.nextInt(1000);//0-999
		y = x % 101;//0-100
		System.out.println(x + "=>" + y);
		
		x = r.nextInt(1000);
		y = (x % 100) + 1;//1-100
		System.out.println(x + "=>" + y);
	}
}
