package 박유민;

public class Example_399 {
	public static void main(String[] args) {
		try {
			String[] command = {"notepad.exe"};
			ProcessBuilder probuilder = new ProcessBuilder(command);
			
			Process process = probuilder.start();
			System.out.println("notepad 프로그램 실행 시작...");
			
			process.waitFor();
			System.out.println("notepad 프로그램 실행 종료...");
			
			System.out.println("notepad 프로그램 반환 값 : " + process.exitValue());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
