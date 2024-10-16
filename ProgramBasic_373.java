package ������;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;

public class ProgramBasic_373 extends JFrame{
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(" ���ϸ� �Է� >> ");
			String str = in.readLine();
			File f = new File(str);
			if(f.exists()) {
				if(f.isFile()) {
					System.out.println("�����Դϴ�.");
					long t = f.lastModified();
					System.out.print("\t���� ũ��: " + f.length());
					System.out.printf("\t������ �ð�: %tb %td %ta %tT\n", t, t, t, t);
				}
				else if(f.isDirectory()) {
					System.out.println("�����͸��Դϴ�.");
					File [] fnames = f.listFiles();
					for(File sf : fnames) {
						long t = sf.lastModified();
						System.out.println("\t���� ũ��: "+ sf.length());
						System.out.printf("\t������ �ð�: %tb %td %ta %tT\n", t, t, t, t);
					}
				}
			}
			else {
				System.out.println("�Է��� �̸��� �����̳� ���͸��� �������� �ʽ��ϴ�.");
			}
			in.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
