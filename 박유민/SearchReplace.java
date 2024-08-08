package 박유민;

import java.util.Scanner;

public class SearchReplace {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장 입력 : ");
		String statement = sc.nextLine();
		System.out.println("찾고자 하는 단어 : ");
		String sword = sc.next();//next와 nextLine의 차이? : 문장은 공백을 포함하고 있기 때문에 단어는 공백 X
		System.out.println("바꾸고자 하는 단어 : ");
		String rword = sc.next();
		
		statement = statement.replaceFirst(sword, rword);
		System.out.println(statement);
		
		
	}
}
