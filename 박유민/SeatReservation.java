package 박유민;

public class SeatReservation {
	public static void main(String[] args) {
		
		boolean [][] seats = new boolean[10][5];
		char menuChar;
		
		//좌석 초기화
		for(int r = 0; r < seats.length; r++) {
			for(int c = 0; c < seats[r].length; c++) {
				seats[r][c] = false;
			}
		}
		
		do {
			//메뉴 출력
			System.out.println("s : 예약 현황 보기");
			System.out.println("r : 예약하기");
			System.out.println("c : 예약취소");
		}
	}
}
