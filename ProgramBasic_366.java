package ������;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramBasic_366 {
	public static void main(String[] args) {
		try {
			FileWriter fout = new FileWriter("hangul.txt");
			fout.write("�ѱ� ");
			fout.write(88);
			fout.write(Double.toString(32.3));
			
			fout.close();
			System.out.println("���������� ���⸦ ���ƽ��ϴ�.");
			
			FileReader fin = new FileReader("hangul.txt");
			char[] buf = new char[80];
			fin.read(buf);
			for(char c : buf) System.out.print(c);
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
