package ������;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ProgramBasic_363 {
	public static void main(String[] args) {
		FileOutputStream out = null;
		OutputStreamWriter fout = null;
		double d = 32.3;
		try {
			out = new FileOutputStream("hangul.txt");
			fout = new OutputStreamWriter(out, "UTF-16");
			
			fout.write("�ѱ�  ");
			fout.write(Double.toString(d));
			
			fout.close();
			System.out.println("���������� ���⸦ ���ƽ��ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
