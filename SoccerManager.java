package test;

import java.util.Scanner;

public class SoccerManager {
	public static void main(String[] args) {
		SoccerManager manager = new SoccerManager();
		manager.start();
	}

	구단[] groups = new 구단[100];
	int count = 0;

	void start() {
		Scanner sc = new Scanner(System.in);
		int select;
		do {
			System.out.println("<축구구단 관리 프로그램>");
			System.out.println("1. 구단 추가");
			System.out.println("2. 구단 편집");
			System.out.println("3. 구단 삭제");
			System.out.println("4. 구단 보기");
			System.out.println("5. 프로그램 종료");

			System.out.println("입력 : ");
			select = sc.nextInt();

			switch (select) {
			case 1:
				Add_Group();
				break;
			case 2:
				Edit_Group_menu();
				break;
			case 3:
				Delete_Group();
				break;
			case 4:
				Show_Group_menu();
				break;
			case 5:
				System.out.println("시스템이 종료되었습니다.");
				return;
			}
		} while (true);
	}

	private void Add_Group() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("<<구단 추가>>");
		groups[count] = new 구단();
		System.out.println("구단이름 입력 : ");
		name = sc.nextLine();
		groups[count].SetName(name);
		System.out.println(">구단이 생성되었습니다.");
		count++;
	}

	private void Edit_Group_menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<<구단 편집>>");
		int i;
		int select;
		while (true) {
			for (i = 0; i < count; i++) {
				System.out.println((i + 1) + ". " + groups[i].getName());
			}
			System.out.println((i + 1) + ". 나가기");
			System.out.println("편집할 구단 입력 : ");
			select = sc.nextInt() - 1;
			if (select >= count || select < 0)
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			else
				break;
		}
		groups[select].Edit_Group();
	}

	private void Delete_Group() {
		Scanner sc = new Scanner(System.in);
		int select;
		for(int i = 0; i < count; i++) {
			System.out.println((i+1) + ". " + groups[i].getName());
		}
		System.out.println("삭제할 구단를 선택하세요 : ");
		select = sc.nextInt()-1;
		groups[select].DeleteGroup();
		groups[select] = null;
		count--;
		for(int i = select; i < count; i++) {
			groups[i] = groups[i+1];
		}
		groups[count] = null;
		System.out.println("삭제되었습니다.");
	}
	

	private void Show_Group_menu() {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". " + groups[i].getName());
			groups[i].Show_Group();
		}
	}
}

class 구단 {

	private String name;
	private 코치[] coaches = new 코치[100];
	private 선수[] players = new 선수[100];
	private int c_count = 0;
	private int p_count = 0;

	public void SetName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void DeleteGroup() {
		this.name = null;
		for(int i = 0; i < c_count; i++) {
			coaches[i].deleteName();
			coaches[i] = null;
		}
		for(int j = 0; j < p_count; j++) {
			
		}
	}
	public void Edit_Group() {
		Scanner sc = new Scanner(System.in);
		int select;
		do {
			System.out.println("<<" + this.getName() + "을 편집합니다.>>");
			System.out.println("1. 코치추가");
			System.out.println("2. 선수추가");
			System.out.println("3. 코치삭제");
			System.out.println("4. 선수삭제");
			System.out.println("5. 나가기");

			System.out.println("입력 : ");
			select = sc.nextInt();

			switch (select) {
			case 1:
				Add_Coach(); break;
			case 2:
				Add_Player(); break;
			case 3:
				Delete_Coach(); break;
			case 4:
				Delete_Player(); break;
			case 5:
				System.out.println("메뉴로 돌아갑니다.");
				return;
			}
		} while (true);
	}

	private void Add_Coach() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("코치이름을 입력해주세요 :");
		name = sc.nextLine();
		coaches[c_count] = new 코치(name);
		c_count++;
	}

	private void Add_Player() {//
		Scanner sc = new Scanner(System.in);
		System.out.println("<<<선수를 추가합니다.>>>");
		System.out.println("선수이름 : ");
		String name = sc.nextLine();
		System.out.println("선수연봉(만원) : ");
		int money = sc.nextInt();
		players[p_count] = new 선수(name, money);
		p_count++;
	}

	public void Show_Group() {

		for (int i = 0; i < c_count; i++) {
			System.out.println("    - " + coaches[i].getName() + " 코치");
		}

		for (int j = 0; j < p_count; j++) {
			System.out.println("    -- " + players[j].getName() + " 선수/연봉(만원) : " + players[j].getMoney());
		}

	}

	private void Delete_Coach() {
		Scanner sc = new Scanner(System.in);
		int select;
		for(int i = 0; i < c_count; i++) {
			System.out.println((i+1) + ". " + coaches[i].getName() + " 코치");
		}
		System.out.println("삭제할 코치를 선택하세요 : ");
		select = sc.nextInt()-1;
		coaches[select].deleteName();
		coaches[select] = null;
		c_count--;
		for(int i = select; i < c_count; i++) {
			coaches[i] = coaches[i+1];
		}
		coaches[c_count] = null;
		System.out.println("삭제되었습니다.");
	}

	private void Delete_Player() {
		Scanner sc = new Scanner(System.in);
		int select;
		for(int i = 0; i < p_count; i++) {
			System.out.println((i+1) + ". " + players[i].getName() + " 선수");
		}
		System.out.println("삭제할 선수를 선택하세요 : ");
		select = sc.nextInt()-1;
		players[select].deleteName();
		players[select] = null;
		p_count--;
		for(int i = select; i < p_count; i++) {
			players[i] = players[i+1];
		}
		players[p_count] = null;
		System.out.println("삭제되었습니다.");
	}
}

class 선수 {
	private String name;
	private int money;

	public 선수(String name, int money) {
		this.name = name;
		this.money = money;
		System.out.println(">" + this.name + "이/가 추가되었습니다.");
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}
	public void deleteName() {
		this.name = null;
	}
}

class 코치 {
	private String name;

	public 코치(String name) {
		this.name = name;
		System.out.println(">" + this.name + "이/가 추가되었습니다.");
	}

	public String getName() {
		return name;
	}
	public void deleteName() {
		this.name = null;
	}
}