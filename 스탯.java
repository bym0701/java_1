package ���Ű���;

import java.util.Random;

public class ���� {
	private int ����;
	private int ü��;
	private int ���ݷ�;
	private int ����;
	
	public void Random() {
		Random rnd = new Random();
		this.ü�� = rnd.nextInt(1000);
		this.���� = rnd.nextInt(10);
		this.���ݷ� = rnd.nextInt(500);
		this.���� = rnd.nextInt(500);
	}
	public int get����() {
		return this.����;
	}
	public int getü��() {
		return this.ü��;
	}
	public int get���ݷ�() {
		return this.���ݷ�;
	}
	public int get����() {
		return this.����;
	}
	
}
