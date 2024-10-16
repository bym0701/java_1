package ¹ÚÀ¯¹Î;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramBasic_389 {
	public static void main(String[] args) {
		try {
			File gradeFile = new File("scores.txt");
			
			Scanner inFile = new Scanner(gradeFile);
			while(inFile.hasNextLine()) {
				String line = inFile.nextLine();
				String[] st = line.split("[:]+");
				
				double sum = 0;
				for(int n = 1; n < st.length; n++)
					sum += Integer.parseInt(st[n]);
				System.out.printf("%s %5.2f\n", "Æò±Õ", sum/(st.length-1));
			}
			inFile.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
