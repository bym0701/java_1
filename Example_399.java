package ������;

public class Example_399 {
	public static void main(String[] args) {
		try {
			String[] command = {"notepad.exe"};
			ProcessBuilder probuilder = new ProcessBuilder(command);
			
			Process process = probuilder.start();
			System.out.println("notepad ���α׷� ���� ����...");
			
			process.waitFor();
			System.out.println("notepad ���α׷� ���� ����...");
			
			System.out.println("notepad ���α׷� ��ȯ �� : " + process.exitValue());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
