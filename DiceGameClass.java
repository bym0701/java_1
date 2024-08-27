package 박유민;

import java.util.Random;
import java.util.Scanner;

public class DiceGameClass {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			game.startPlaying();
			System.out.println("1.계속 진행    2.종료 : ");
			input = sc.nextInt();
			
			if(input == 1)
				continue;
			else if(input == 2) {
				System.out.println("종료합니다.");
				break;
			}
			else System.out.println("잘못된 입력입니다. 계속 진행합니다.");
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
			System.out.println("맞았습니다.");
			return 1;
		}
		else {
			System.out.println("틀렸습니다.");
			return 0;
		}
	}
		
	
	public void startPlaying() {
		int diceFace = RollDice();
		
		while(true) {
			count++;
			int userGuess = getUserInput("예상 값을 입력하시오.: ");
			int result = checkUserGuess(diceFace, userGuess);
			
			if(result == 1) {
				System.out.println(count + "번만에 맞았습니다.");
				count = 0;
				break;
			}
				
		}
	}
}