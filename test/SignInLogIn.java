package test;

import java.util.Scanner;

import 박유민.SeatReservation;

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
			case 's' : count = SignIn(ids, pws, count); break;
			case 'l' : LogIn(ids, pws, count); break;
			case 'e' : System.out.println("시스템 종료되었습니다.");
			return;
			}
		}while(true);
	}
	
	public static int SignIn(String[] ids, String[] pws, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		ids[count] = sc.nextLine();
		System.out.println("패스워드 : ");
		pws[count] = sc.nextLine();
		System.out.println("회원가입되었습니다.");
		count++;
		return count;
	}
	
	public static void LogIn(String[] ids, String[] pws, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String LoginId = sc.nextLine();
		System.out.println("패스워드 : ");
		String LoginPw = sc.nextLine();
		
		LoginId = LoginId.trim();
		LoginPw = LoginPw.trim();
		
		LoginId = LoginId.toLowerCase();
		LoginPw = LoginPw.toLowerCase();
		
		int flag = 3;
		
		for(int i = 0; i < count; i++) {
			if(ids[i].equals(LoginId)) {
				if(pws[i].equals(LoginPw)) {
					flag = 1;
				}
				else flag = 2; 
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("로그인되었습니다.");
			SeatReservation.main(null); //모듈
		}
		else if(flag == 2)System.out.println("패스워드가 일치하지 않습니다.");
		else if(flag == 3)System.out.println("아이디가 존재하지 않습니다.");
		
	}
	
}
