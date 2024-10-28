package 용사키우기;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class 용사키우기 extends 스탯{
	public static void main(String[] args) {
		용사키우기 용사키우기 = new 용사키우기();
		용사키우기.Start();
	}
	void Start() {
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			Show_스탯();
			System.out.println("1. 랜덤 스탯");
			System.out.println("2. Save");
			System.out.println("3. Load");
			System.out.println("번호를 입력해주세요 (종료 : -1) : ");
			input = sc.nextInt();
			if(input == 1)
				Random_스탯();
				
			else if(input == 2)
				Save();
			
			else if(input == 3)
				Load();

			else if(input == -1)
				break;
			
			else
				System.out.println("다시 입력해주세요.");
		}
	}
	public void Save() {
		try {
			PrintWriter out = new PrintWriter("용사.txt");
			out.println(get레벨()+"::"+get체력()+"::"+get공격력()+"::"+get방어력()+"::"+get색깔());
			System.out.println("저장 성공");
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void Load() {
		try {
			File loadFile = new File("용사.txt");
			Scanner sc= new Scanner(loadFile);
			sc.useDelimiter("::");
			스탯 s = new 스탯();
			s.set레벨(sc.nextInt());
			s.set체력(sc.nextInt());
			s.set공격력(sc.nextInt());
			s.set방어력(sc.nextInt());
			s.set색깔(sc.next());
			sc.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
