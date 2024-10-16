package 박유민;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProgramBasic_364 {
	public static void main(String[] args) {
		double d = 32.3;
		try {
			FileOutputStream fout = new FileOutputStream("hangul.txt");
			OutputStreamWriter out = new OutputStreamWriter(fout);
			System.out.println("인코딩 문자 집합은 " + out.getEncoding());
			out.write("한글 ");
			out.write(Double.toString(d));
			out.close();
			fout.close();
			System.out.println("성공적으로 쓰기를 마쳤습니다.");
			
			FileInputStream fin = new FileInputStream("hangul.txt");
			InputStreamReader in = new InputStreamReader(fin);
			int c;
			System.out.println("디코딩 문자 집합은 " + in.getEncoding());
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
