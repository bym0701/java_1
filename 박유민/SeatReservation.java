package ������;

import java.util.Scanner;

public class SeatReservation {
	public static void main(String[] args) {

		boolean [][] seats = new boolean[10][5];
		char menuChar;

		//�¼� �ʱ�ȭ
		for(int r = 0; r < seats.length; r++) {
			for(int c = 0; c < seats[r].length; c++) {
				seats[r][c] = false;
			}
		}
		
		do {
			//�޴� ���
			System.out.println("s : ���� ��Ȳ ����");
			System.out.println("r : �����ϱ�");
			System.out.println("c : ���� ���");
			System.out.println("e : ���α׷� ����");
			
			//�޴� ����
			System.out.print("���ϴ� �޴� ����  (s, r, c, e) �� �ϳ��� �Է��ϼ���. : ");
			Scanner sc = new Scanner(System.in);
			menuChar = sc.next().charAt(0); 
			
			//�޴� ó��
			switch(menuChar) {
			case 's' : showReservationStatus(seats); break;
			case 'r' : reserveSeat(seats); break;
			case 'c' : cancelReservation(seats); break;
			case 'e' : System.out.println("�ý��� ����Ǿ����ϴ�.");
			return;
			}
		}while(true);
		
	}
	
	public static void showReservationStatus(boolean[][] seats) {
		System.out.println("o�� ���� ������ �ڸ��Դϴ�.");
		for(int r = 0; r < seats.length; r++) {
			for(int c = 0; c < seats[r].length; c++) {
				if(seats[r][c] == true) System.out.print("x ");
				else System.out.print("o ");
			}
			System.out.println();
		}
	}
	
	public static void reserveSeat(boolean[][] seats) {
		System.out.print("���ϴ� �¼��� ��(1 ~ 10)�� ��(1 ~ 5) ��ȣ�� �Է��ϼ���. (�� : 5 3) : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt() - 1;
		int col = sc.nextInt() - 1;
		
		if(row >= 0 && row <= 9 && col >= 0 && col <= 4) {
			
			if(seats[row][col] != true) seats[row][col] = true;
			else System.out.println("�̹� ����Ǿ� �ִ� �ڸ��Դϴ�.");
		}
		else System.out.println("�¼� �� �Ǵ� �� ��ȣ�� �߸��Ǿ����ϴ�.");
	}
	
	public static void cancelReservation(boolean[][] seats) {
		System.out.print("����ϰ��� �ϴ� �¼��� ��(1 ~ 10)�� ��(1 ~ 5) ��ȣ�� �Է��ϼ���. (�� 5 3) : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt() - 1;
		int col = sc.nextInt() - 1;
		
		if (row >= 0 && row <= 9 && col >= 0 && col <= 4) {
			if(seats[row][col] == true) seats[row][col] = false;
			else System.out.println("������� ���� �ڸ� �Դϴ�.");
		}
		else System.out.println("�¼� �� �Ǵ� �� ��ȣ�� �߸��Ǿ����ϴ�.");
	}
}