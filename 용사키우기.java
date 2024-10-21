package 용사키우기;

import java.io.PrintWriter;
import java.util.Scanner;

public class 용사키우기 extends 스탯{
	public static void main(String[] args) {
		용사키우기 용사키우기 = new 용사키우기();
		용사키우기.Start();
	}
	void Start() {
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.println("1을 입력하면 스탯이 랜덤으로 바뀝니다. (종료 : -1) : ");
			input = sc.nextInt();
			if(input == 1) {
				Random();
				Save();
			}
				
			else if(input == -1) {
				System.out.println("종료");
				break;
			}
				
			else
				System.out.println("다시 입력해주세요.");
		}
	}
	public void Save() {
		try {
			PrintWriter out = new PrintWriter("용사.txt");
			out.println("1. 레벨 : " + get레벨());
			out.println("2. 체력 : " + get체력());
			out.println("3. 공격력 : " + get공격력());
			out.println("4. 방어력 : " + get방어력());
			System.out.println("저장 성공");
			out.close();

		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("1. 레벨 : " + get레벨());
		System.out.println("2. 체력 : " + get체력());
		System.out.println("3. 공격력 : " + get공격력());
		System.out.println("4. 방어력 : " + get방어력());
	}
}
