package test;

import java.util.Scanner;

public class SignInLogIn {
	public static void main(String[] args) {
		//회원가입하기, 로그인하기, 시스템 종료
		
		String[] ids = new String[100];
		String[] pws = new String[100];
		int count=0;
		char menuChar;
		
		do {
			//메뉴 출력
			System.out.println("s : 회원가입 하기");
			System.out.println("l : 로그인 하기");
			System.out.println("e : 프로그램 종료");
			
			//메뉴 선택
			System.out.print("원하는 메뉴 글자 (s, l, e) 중 하나를 입력하세요. : ");
			Scanner sc = new Scanner(System.in);
			menuChar = sc.next().charAt(0);
			
			//메뉴 처리
			switch(menuChar) {
			case 's' : SignIn(ids, pws); break;
			case 'l' : LogIn(ids, pws); break;
			case 'e' : System.out.println("시스템 종료되었습니다.");
			return;
			}
		}
	}
}
