package ������;

import java.util.Scanner;

public class ProgramBasic_391 {
	public static void main(String[] args) {
		try {
			String input = "1 �Ǵ� 2 �Ǵ� red �Ǵ� blue";
			Scanner s = new Scanner(input);
			s.useDelimiter("\\s*�Ǵ�\\s*");
		//	s.useDelimiter("\\s+�Ǵ�\\s+");
			System.out.println(s.nextInt());
			System.out.println(s.nextInt());
			System.out.println(s.next());
			System.out.println(s.next());
			s.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
