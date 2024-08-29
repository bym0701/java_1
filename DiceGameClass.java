package 박유민;

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
			System.out.println("1.계속 진행    2.종료 : ");
			input = sc.nextInt();
			
			if(input == 1)
				continue;
			else if(input == 2) {
				System.out.println("종료합니다.");
				total_point = game.getTotalpoint();
				System.out.println("총 점수 : " + total_point);
				break;
			}
			else System.out.println("잘못된 입력입니다. 계속 진행합니다.");
		}
	}
			
}
		

class DiceGame{
	
	Random generator = new Random();
	private int point = 0;
	
	private int RollDice() {
		int d;
		d = generator.nextInt(6)+1;
		System.out.println("주사위가 돌아갔습니다.");
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
			System.out.println("맞았습니다.");
			return 1;
		}
		else {
			System.out.println("틀렸습니다.");
			return 0;
		}
	}
	
	private void Point(int count) {
		System.out.println(count + "번만에 맞았습니다.");
		
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
			int userGuess = getUserInput("예상 값을 입력하세요.: ");
			int result = checkUserGuess(diceFace, userGuess);
			count++;
			
			if(result == 1) {
				Point(count);
				break;
			}
				
		}
	}
}