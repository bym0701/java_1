package 박유민;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramBasic_367 {
	public static void main(String[] args) {
		try {
			System.out.println(">> ");
			InputStreamReader in = new InputStreamReader(System.in);
			
			FileWriter fout = null;
			int c;
			
			fout = new FileWriter("test.txt");
			while((c = in.read()) != 13) {
				fout.write(c);
			}
			in.close();
			fout.close();
			System.out.println("성공적으로 쓰기를 마쳤습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
