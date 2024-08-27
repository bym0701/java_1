package ������;

import java.util.Random;
import java.util.Scanner;

public class DiceGameClass {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			game.startPlaying();
			System.out.println("1.��� ����    2.���� : ");
			input = sc.nextInt();
			
			if(input == 1)
				continue;
			else if(input == 2) {
				System.out.println("�����մϴ�.");
				break;
			}
			else System.out.println("�߸��� �Է��Դϴ�. ��� �����մϴ�.");
		}
	}
			
}
		

class DiceGame{
	
	Random generator = new Random();
	private int count = 0;
	private int [] num = new int[100];
	
	private int RollDice() {
		int d;
		d = generator.nextInt(6)+1;
		return d;
	}
	
	private int getUserInput(String prompt) { 
		int r;
		
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		num[count] = r;
		
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
		
	
	public void startPlaying() {
		int diceFace = RollDice();
		
		while(true) {
			count++;
			int userGuess = getUserInput("���� ���� �Է��Ͻÿ�.: ");
			int result = checkUserGuess(diceFace, userGuess);
			
			if(result == 1) {
				System.out.println(count + "������ �¾ҽ��ϴ�.");
				count = 0;
				break;
			}
				
		}
	}
}