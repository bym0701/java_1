package ���Ű���;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class ���Ű��� extends ����{
	public static void main(String[] args) {
		���Ű��� ���Ű��� = new ���Ű���();
		���Ű���.Start();
	}
	void Start() {
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			Show_����();
			System.out.println("1. ���� ����");
			System.out.println("2. Save");
			System.out.println("3. Load");
			System.out.println("��ȣ�� �Է����ּ��� (���� : -1) : ");
			input = sc.nextInt();
			if(input == 1)
				Random_����();
				
			else if(input == 2)
				Save();
			
			else if(input == 3)
				Load();

			else if(input == -1)
				break;
			
			else
				System.out.println("�ٽ� �Է����ּ���.");
		}
	}
	public void Save() {
		try {
			PrintWriter out = new PrintWriter("���.txt");
			out.println(get����()+"::"+getü��()+"::"+get���ݷ�()+"::"+get����()+"::"+get����());
			System.out.println("���� ����");
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void Load() {
		try {
			File loadFile = new File("���.txt");
			Scanner sc= new Scanner(loadFile);
			sc.useDelimiter("::");
			���� s = new ����();
			s.set����(sc.nextInt());
			s.setü��(sc.nextInt());
			s.set���ݷ�(sc.nextInt());
			s.set����(sc.nextInt());
			s.set����(sc.next());
			sc.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
