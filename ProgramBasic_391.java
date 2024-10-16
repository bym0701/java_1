package 박유민;

import java.util.Scanner;

public class ProgramBasic_391 {
	public static void main(String[] args) {
		try {
			String input = "1 또는 2 또는 red 또는 blue";
			Scanner s = new Scanner(input);
			s.useDelimiter("\\s*또는\\s*");
		//	s.useDelimiter("\\s+또는\\s+");
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
