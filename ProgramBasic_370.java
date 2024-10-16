package ������;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramBasic_370 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
		try {
			int c;
			System.out.println(">> ");
			while((c = in.read()) != 13) {
				out.write(c);
			}
			System.out.println("���������� ���⸦ ���ƽ��ϴ�.");
			out.flush();
			if(in != null) {
				in.close();
				out.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
