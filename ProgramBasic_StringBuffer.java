package ������;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramBasic_StringBuffer {
	public static void main(String args[]) {
		
		//p.162-1
		StringBuffer sBuffer = new StringBuffer(" test");
		sBuffer.append(" String Buffer");
		System.out.println(sBuffer);
		
		//p.164-1
		String input = "I have a cat, but I like my dog better.";
		Pattern p = Pattern.compile("(cat|dog)");
		Matcher m = p.matcher(input);
		System.out.println(input);
		
		//p.165
		String input1 = "���� ��� ������ �� �Ǵ� ��� ������ �� �챸 ��";
		Pattern p1 = Pattern.compile("(��|����|���)");
		Matcher m1 = p1.matcher(input1);
		while (m1.find()) {
			System.out.println(m1.start() + "��������" + (m1.end()-1) + "����" + m1.group() + "�߰�");
		}
		
	}
}
