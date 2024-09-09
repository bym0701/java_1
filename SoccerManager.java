package test;

import java.util.Scanner;

public class SoccerManager {
	public static void main(String[] args) {
		SoccerManager manager = new SoccerManager();
		manager.start();
	}

	����[] groups = new ����[100];
	int count = 0;

	void start() {
		Scanner sc = new Scanner(System.in);
		int select;
		do {
			System.out.println("<�౸���� ���� ���α׷�>");
			System.out.println("1. ���� �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ����");
			System.out.println("5. ���α׷� ����");

			System.out.println("�Է� : ");
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
				System.out.println("�ý����� ����Ǿ����ϴ�.");
				return;
			}
		} while (true);
	}

	private void Add_Group() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("<<���� �߰�>>");
		groups[count] = new ����();
		System.out.println("�����̸� �Է� : ");
		name = sc.nextLine();
		groups[count].SetName(name);
		System.out.println(">������ �����Ǿ����ϴ�.");
		count++;
	}

	private void Edit_Group_menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<<���� ����>>");
		int i;
		int select;
		while (true) {
			for (i = 0; i < count; i++) {
				System.out.println((i + 1) + ". " + groups[i].getName());
			}
			System.out.println((i + 1) + ". ������");
			System.out.println("������ ���� �Է� : ");
			select = sc.nextInt() - 1;
			if (select >= count || select < 0)
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
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
		System.out.println("������ ���ܸ� �����ϼ��� : ");
		select = sc.nextInt()-1;
		groups[select].DeleteGroup();
		groups[select] = null;
		count--;
		for(int i = select; i < count; i++) {
			groups[i] = groups[i+1];
		}
		groups[count] = null;
		System.out.println("�����Ǿ����ϴ�.");
	}
	

	private void Show_Group_menu() {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". " + groups[i].getName());
			groups[i].Show_Group();
		}
	}
}

class ���� {

	private String name;
	private ��ġ[] coaches = new ��ġ[100];
	private ����[] players = new ����[100];
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
			System.out.println("<<" + this.getName() + "�� �����մϴ�.>>");
			System.out.println("1. ��ġ�߰�");
			System.out.println("2. �����߰�");
			System.out.println("3. ��ġ����");
			System.out.println("4. ��������");
			System.out.println("5. ������");

			System.out.println("�Է� : ");
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
				System.out.println("�޴��� ���ư��ϴ�.");
				return;
			}
		} while (true);
	}

	private void Add_Coach() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("��ġ�̸��� �Է����ּ��� :");
		name = sc.nextLine();
		coaches[c_count] = new ��ġ(name);
		c_count++;
	}

	private void Add_Player() {//
		Scanner sc = new Scanner(System.in);
		System.out.println("<<<������ �߰��մϴ�.>>>");
		System.out.println("�����̸� : ");
		String name = sc.nextLine();
		System.out.println("��������(����) : ");
		int money = sc.nextInt();
		players[p_count] = new ����(name, money);
		p_count++;
	}

	public void Show_Group() {

		for (int i = 0; i < c_count; i++) {
			System.out.println("    - " + coaches[i].getName() + " ��ġ");
		}

		for (int j = 0; j < p_count; j++) {
			System.out.println("    -- " + players[j].getName() + " ����/����(����) : " + players[j].getMoney());
		}

	}

	private void Delete_Coach() {
		Scanner sc = new Scanner(System.in);
		int select;
		for(int i = 0; i < c_count; i++) {
			System.out.println((i+1) + ". " + coaches[i].getName() + " ��ġ");
		}
		System.out.println("������ ��ġ�� �����ϼ��� : ");
		select = sc.nextInt()-1;
		coaches[select].deleteName();
		coaches[select] = null;
		c_count--;
		for(int i = select; i < c_count; i++) {
			coaches[i] = coaches[i+1];
		}
		coaches[c_count] = null;
		System.out.println("�����Ǿ����ϴ�.");
	}

	private void Delete_Player() {
		Scanner sc = new Scanner(System.in);
		int select;
		for(int i = 0; i < p_count; i++) {
			System.out.println((i+1) + ". " + players[i].getName() + " ����");
		}
		System.out.println("������ ������ �����ϼ��� : ");
		select = sc.nextInt()-1;
		players[select].deleteName();
		players[select] = null;
		p_count--;
		for(int i = select; i < p_count; i++) {
			players[i] = players[i+1];
		}
		players[p_count] = null;
		System.out.println("�����Ǿ����ϴ�.");
	}
}

class ���� {
	private String name;
	private int money;

	public ����(String name, int money) {
		this.name = name;
		this.money = money;
		System.out.println(">" + this.name + "��/�� �߰��Ǿ����ϴ�.");
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

class ��ġ {
	private String name;

	public ��ġ(String name) {
		this.name = name;
		System.out.println(">" + this.name + "��/�� �߰��Ǿ����ϴ�.");
	}

	public String getName() {
		return name;
	}
	public void deleteName() {
		this.name = null;
	}
}