package 용사키우기;

import java.util.Random;

public class 스탯 {
	private int 레벨;
	private int 체력;
	private int 공격력;
	private int 방어력;
	private String 색깔;
	private String[] color = {"파란색", "노란색", "빨간색"};
	
	Random rnd = new Random();
	public void Random_스탯() {
		this.체력 = rnd.nextInt(1000);
		this.레벨 = rnd.nextInt(10);
		this.공격력 = rnd.nextInt(500);
		this.방어력 = rnd.nextInt(500);
		this.색깔 = color[rnd.nextInt(3)];
		System.out.println("랜덤 스탯 성공");
	}
	public void Show_스탯() {
		
	}
	public int get레벨() {return this.레벨;}
	public int get체력() {return this.체력;}
	public int get공격력() {return this.공격력;}
	public int get방어력() {return this.방어력;}
	public String get색깔() {return this.색깔;}
	
	public void set레벨(int n) {this.레벨 = n;}
	public void set체력(int n) {this.체력 = n;}
	public void set공격력(int n) {this.공격력 = n;}
	public void set방어력(int n) {this.방어력 = n;}	
	public void set색깔(String n) {this.색깔 = n;}
	
}
