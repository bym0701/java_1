package 박유민;

import java.util.Scanner;

public class ProgramBasic_382 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner (System.in);
			System.out.print(">> ");
			while(sc.hasNextInt()) {
				int i = sc.nextInt();
				System.out.println("입력 값: " + i);
				System.out.println(">> ");
			}
			System.out.println("입력이 완료되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
