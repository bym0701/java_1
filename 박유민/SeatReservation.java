package ������;

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
			System.out.println("c : �������");
		}
	}
}
