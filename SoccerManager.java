package test;

import java.util.Scanner;

public class SoccerManager {
	public static void main(String[] args) {
		SoccerManager manager = new SoccerManager();
		manager.start();
	}
	
	
	���� [] groups = new ����[100];
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
			
			switch(select) {
			case 1 : Add_Group(); break;
			case 2 : Edit_Group_menu(); break;
			case 3 : Delete_Group(); break;
			case 4 : Show_Group(); break;
			case 5 : System.out.println("�ý����� ����Ǿ����ϴ�.");
			return;
			}
		}while(true);
	}	
	
	private void Add_Group() {
		Scanner sc = new Scanner(System.in);
		String name;  
		System.out.println("<<���� �߰�>>");
		groups[count]= new ����();
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
		while(true) {
			for(i = 0; i < count; i++) {
			System.out.println((i+1) + ". " + groups[i].getName());
			}
			System.out.println((i+1) + ". ������");
			System.out.println("������ ���� �Է� : ");
			select = sc.nextInt()-1;
			if(select > i+1 || select < 0)
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			else
				break;
		}
		groups[select].Edit_Group();
	}
	private void Delete_Group() {
		System.out.println("�ٸ� �޴��� �������ּ���.");
	}
	private void Show_Group() {
		for(int i = 0; i < count; i++) {
			System.out.println((i+1) + ". " + groups[i].getName());
			}
	}
}

class ���� {
	
	private String name;
	public void SetName(String name) {
		this.name = name;
	}
	public String getName() {return name;}
	
	public void Edit_Group() {
		int select;
		do {
			System.out.println("<<" + this.getName() +"�� �����մϴ�.>>");
			System.out.println("1. ��ġ�߰�");
			System.out.println("2. �����߰�");
			System.out.println("3. ��ġ����");
			System.out.println("4. ��������");
			System.out.println("5. ������");
		
		
			System.out.println("�Է� : ");
			select = sc.nextInt();
		
			switch(select) {
			case 1 :  Add_Coach(); break;
			case 2 :  Add_Player(); break;
			case 3 :  Delete_Coach(); break;
			case 4 :  Delete_Player(); break;
			case 5 : System.out.println("�ý����� ����Ǿ����ϴ�.");
			return;
			}
		}while(true);
	}
	
	private void Add_Coach() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("��ġ�̸��� �Է����ּ��� :");
		name = sc.nextLine();
		��ġ coach = new ��ġ();
		coach.SetName(name);
		System.out.println(">" + coach.getName() +"�� �߰��Ǿ����ϴ�.");
	}
	
	private void Add_Player() {
		System.out.println("<<<������ �߰��մϴ�.>>>");
		System.out.println("�����̸� : ");
		String name = sc.nextLine();
		System.out.println("��������(����) : ");
		int money = sc.nextInt();
		���� player = new ����();
		player.SetInfo(name, money);
		System.out.println(">" + player.getName() + "�� �߰��Ǿ����ϴ�.");
	}
	
	private void Delete_Coach() {
		System.out.println("�ٸ� �޴��� �������ּ���.");
	}
	
	private void Delete_Player() {
		System.out.println("�ٸ� �޴��� �������ּ���.");
	}
}
class ����{
	private String name;
	private int money;
	
	public void SetInfo(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public String getName() {return name;}
}
class ��ġ{
	private String name;
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
}