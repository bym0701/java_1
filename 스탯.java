package ���Ű���;

import java.util.Random;

public class ���� {
	private int ����;
	private int ü��;
	private int ���ݷ�;
	private int ����;
	private String ����;
	private String[] color = {"�Ķ���", "�����", "������"};
	
	Random rnd = new Random();
	public void Random_����() {
		this.ü�� = rnd.nextInt(1000);
		this.���� = rnd.nextInt(10);
		this.���ݷ� = rnd.nextInt(500);
		this.���� = rnd.nextInt(500);
		this.���� = color[rnd.nextInt(3)];
		System.out.println("���� ���� ����");
	}
	public void Show_����() {
		
	}
	public int get����() {return this.����;}
	public int getü��() {return this.ü��;}
	public int get���ݷ�() {return this.���ݷ�;}
	public int get����() {return this.����;}
	public String get����() {return this.����;}
	
	public void set����(int n) {this.���� = n;}
	public void setü��(int n) {this.ü�� = n;}
	public void set���ݷ�(int n) {this.���ݷ� = n;}
	public void set����(int n) {this.���� = n;}	
	public void set����(String n) {this.���� = n;}
	
}
