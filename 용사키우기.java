package ���Ű���;

import java.io.PrintWriter;
import java.util.Scanner;

public class ���Ű��� extends ����{
	public static void main(String[] args) {
		���Ű��� ���Ű��� = new ���Ű���();
		���Ű���.Start();
	}
	void Start() {
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.println("1�� �Է��ϸ� ������ �������� �ٲ�ϴ�. (���� : -1) : ");
			input = sc.nextInt();
			if(input == 1) {
				Random();
				Save();
			}
				
			else if(input == -1) {
				System.out.println("����");
				break;
			}
				
			else
				System.out.println("�ٽ� �Է����ּ���.");
		}
	}
	public void Save() {
		try {
			PrintWriter out = new PrintWriter("���.txt");
			out.println("1. ���� : " + get����());
			out.println("2. ü�� : " + getü��());
			out.println("3. ���ݷ� : " + get���ݷ�());
			out.println("4. ���� : " + get����());
			System.out.println("���� ����");
			out.close();

		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("1. ���� : " + get����());
		System.out.println("2. ü�� : " + getü��());
		System.out.println("3. ���ݷ� : " + get���ݷ�());
		System.out.println("4. ���� : " + get����());
	}
}
