package 박유민;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ProgramBasic_401 {
	public static void main(String[] args) {
		try {
			String[] command = {"CMD", "/C", "dir"};
			ProcessBuilder probuilder = new ProcessBuilder(command);
			probuilder.directory(new File("d:\\tmp"));
			
			Process process = null;
			process = probuilder.start();
			
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			System.out.printf("실행결과 %s is:\n", Arrays.toString(command));
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			int exitValue = process.waitFor();
			System.out.println("\n\nExit Value is " + exitValue);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
