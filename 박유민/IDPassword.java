package 박유민;

import java.util.Scanner;

public class IDPassword {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String login = sc.next();
		System.out.println("패스워드 : ");
		String password = sc.next();
		
		login = login.trim(); //앞뒤 공백 제거
		password = password.trim();
		
		login = login.toLowerCase(); //소문자로 변환
		password  = password.toLowerCase();
		
		if(login.equals("bmkim")) {
			if(password.equals("koala")) {
				System.out.println("아이디 패스워드 모두 일치합니다.");
			}
			else {
				System.out.println("패스워드가 일치하지 않습니다.");
			}
		}
		else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
		
	}
}
