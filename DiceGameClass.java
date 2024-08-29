package ������;

import java.util.Random;
import java.util.Scanner;

public class DiceGameClass {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		Scanner sc = new Scanner(System.in);
		int input;
		int total_point;
		
		while(true) {
			game.startPlaying();
			System.out.println("1.��� ����    2.���� : ");
			input = sc.nextInt();
			
			if(input == 1)
				continue;
			else if(input == 2) {
				System.out.println("�����մϴ�.");
				total_point = game.getTotalpoint();
				System.out.println("�� ���� : " + total_point);
				break;
			}
			else System.out.println("�߸��� �Է��Դϴ�. ��� �����մϴ�.");
		}
	}
			
}
		

class DiceGame{
	
	Random generator = new Random();
	private int point = 0;
	
	private int RollDice() {
		int d;
		d = generator.nextInt(6)+1;
		System.out.println("�ֻ����� ���ư����ϴ�.");
		return d;
	}
	
	private int getUserInput(String prompt) { 
		int r;
		
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		
		
		return r;
	}
	
	private int checkUserGuess(int diceFace, int userGuess) {
		if(diceFace == userGuess) {
			System.out.println("�¾ҽ��ϴ�.");
			return 1;
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			return 0;
		}
	}
	
	private void Point(int count) {
		System.out.println(count + "������ �¾ҽ��ϴ�.");
		
		if(count == 1) {
			System.out.println("+100 point"); 
			point += 100;
		}
			
		else if(count == 2) {
			System.out.println("+80 point"); 
			point += 80;
		}
			
		else if(count == 3) {
			System.out.println("+60 point"); 
			point += 60;
		}
		
	}
		
	public int getTotalpoint() {
		return point;
	}
	
	public void startPlaying() {
		int diceFace = RollDice();
		int count = 0;
		
		while(true) {
			int userGuess = getUserInput("���� ���� �Է��ϼ���.: ");
			int result = checkUserGuess(diceFace, userGuess);
			count++;
			
			if(result == 1) {
				Point(count);
				break;
			}
				
		}
	}
}