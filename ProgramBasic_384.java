package ¹ÚÀ¯¹Î;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ProgramBasic_384 {
	public static void main(String[] args) {
		double d = 32.3;
		try {
			FileOutputStream out = new FileOutputStream("hangul.txt");
			OutputStreamWriter fout = new OutputStreamWriter(out);
			
			fout.write("ÇÑ±Û ");
			fout.write(Double.toString(d));
			
			fout.close();
			
			File in = new File("hangul.txt");
			Scanner sc = new Scanner(in);
			String line = sc.next();
			double dd = sc.nextDouble();
			System.out.println(line + " " + dd);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
