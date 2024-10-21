package 용사키우기;

import java.util.Random;

public class 스탯 {
	private int 레벨;
	private int 체력;
	private int 공격력;
	private int 방어력;
	
	public void Random() {
		Random rnd = new Random();
		this.체력 = rnd.nextInt(1000);
		this.레벨 = rnd.nextInt(10);
		this.공격력 = rnd.nextInt(500);
		this.방어력 = rnd.nextInt(500);
	}
	public int get레벨() {
		return this.레벨;
	}
	public int get체력() {
		return this.체력;
	}
	public int get공격력() {
		return this.공격력;
	}
	public int get방어력() {
		return this.방어력;
	}
	
}
