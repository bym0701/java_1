package 박유민;

import java.util.Scanner;

public class LineSplit {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자들을 공백으로 구분하여 입력  : ");
		String statement = sc.nextLine();
		
		String [] split = null;
		split = statement.split(" ");
		int sum = 0;
		for (String s : split) sum += Integer.parseInt(s);
		System.out.println(sum);
		
	}
}
