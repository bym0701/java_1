package test;

import java.util.Scanner;


public class SoccerManager {
	public static void main() {
		
	}
	
	Scanner sc = new Scanner(System.in);
	구단 [] groups = new 구단[100];
	int count = 0;
	
	void start() {
		do {
			System.out.println("<축구구단 관리 프로그램>");
			System.out.println("1. 구단 추가");
			System.out.println("2. 구단 편집");
			System.out.println("3. 구단 삭제");
			System.out.println("4. 구단 보기");
			System.out.println("5. 종료");
		
		
			System.out.println("입력 : ");
			int select = sc.nextInt();
		
			switch(select) {
			case 1 : Add_Group(); break;
			case 2 : Edit_Group_menu(); break;
			case 3 : Delete_Group(); break;
			case 4 : Show_Group(); break;
			case 5 : System.out.println("시스템이 종료되었습니다.");
			return;
			}
		}while(true);
	}	
	
	private void Add_Group() {
		String name;
		System.out.println("<<구단 추가>>");
		System.out.println("구단이름 입력 : ");
		name = sc.nextLine();
		groups[count] = new 구단(name);
		System.out.println(">구단이 생성되었습니다.");
		count++;
	}
	private void Edit_Group_menu() {
		System.out.println("<<구단 편집>>");
		int i;
		int select;
		while(true) {
			for(i = 0; i < count; i++) {
			System.out.println((i+1) + ". " + groups[i].getName());
			}
			System.out.println((i+1) + ". 나가기");
			System.out.println("편집할 구단 입력 : ");
			select = sc.nextInt()-1;
			if(select > i+1 || select < 0)
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			else
				break;
		}
		groups[select].Edit_Group(select);
	}
	private void Delete_Group() {
		System.out.println("다른 메뉴를 선택해주세요.");
	}
	private void Show_Group() {
		for(int i = 0; i < count; i++) {
			System.out.println((i+1) + ". " + groups[i].getName());
			}
	}
}

class 구단 {
	private String name;
	public 구단(String name) {
		this.name = name;
	}
	public String getName() {return name;}
	public void Edit_Group(int select) {
		
	}
}
class 선수{
	private String name;
	private int money;
}
class 코치{
	private String name;
}
