package ������;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProgramBasic_394 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("�Է� ���ϸ� >> ");
			String inFile = sc.next();
			
			System.out.print("��� ���ϸ� >> ");
			String outFile = sc.next();
			
			File reader = new File(inFile);
			Scanner in = new Scanner(reader);
			PrintWriter out = new PrintWriter(outFile);
			
			int lineNumber = 1;
			while (in.hasNextLine()) {
				String line = in.nextLine();
				out.println("\* ")
			}
		}
	}
}
