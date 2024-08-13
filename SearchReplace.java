package 박유민;

import java.util.Scanner;

public class SearchReplace {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장 입력 : ");
		String statement = sc.nextLine();
		System.out.println("찾고자 하는 단어 : ");
		String sword = sc.next();
		System.out.println("바꾸고자 하는 단어 : ");
		String rword = sc.next();//nextLine으로 쓰기 아니면 내려주기
		
		statement = statement.replaceFirst(sword, rword);
		System.out.println(statement);
		
		
	}
}
