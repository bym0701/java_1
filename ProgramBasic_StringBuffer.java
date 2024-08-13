package ¹ÚÀ¯¹Î;

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
		String input1 = "³ªÀÇ »ì´ø °íÇâÀº ²É ÇÇ´Â »ê°ñ ºÀ¼ş¾Æ ²É »ì±¸ ²É";
		Pattern p1 = Pattern.compile("(²É|°íÇâ|»ê°ñ)");
		Matcher m1 = p1.matcher(input1);
		while (m1.find()) {
			System.out.println(m1.start() + "¿¡¼­ºÎÅÍ" + (m1.end()-1) + "±îÁö" + m1.group() + "¹ß°ß");
		}
		
	}
}
