package ¹ÚÀ¯¹Î;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	private static String getString(String str1, String str2, String str3) {
		String input;
		Pattern pattern;
		Matcher m;
		
		Scanner sc = new Scanner(System.in);
		pattern = Pattern.compile(str2);
		
		while(true) {
			System.out.println(str1);
			input = sc.nextLine();
			m = pattern.matcher(input);
			
			if(!m.matches()) {
				System.out.println(str3);
			}
			else break;
		}
		return input;
	}
	
	public static void main(String[] args) {
		String name = getString("ÀÌ¸§ : ","^[°¡-ÆR]{2,4}$","ÀÌ¸§ Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
		String address = getString("ÁÖ¼Ò : ", "^[°¡-ÆR]{2,4}µµ\\s+[°¡-ÆR]{2,4}½Ã\\s+[°¡-ÆR]{2,6}·Î\\s+\\d{2,4}$", "ÁÖ¼Ò Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
		String address_number = getString("¿ìÆí¹øÈ£ : ", "^\\d{5}$", "¿ìÆí¹øÈ£ Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
		String phone_number = getString("ÇÚµåÆù ¹øÈ£ : ", "^01[01]-\\d{4}-\\d{4}$", "ÇÚµåÆù ¹øÈ£ Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
		String bloodtype = getString("Ç÷¾×Çü : ", "^[OAB]{1,2}Çü$", "Ç÷¾×Çü Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
		String birth = getString("»ıÀÏ : ", "\\d{4}³â\\s+\\d{2}¿ù\\s+\\d{2}ÀÏ$", "»ıÀÏ Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
		String gender = getString("¼ºº° : ", "^(³²|¿©)$", "¼ºº° Çü½Ä¿¡ ¸ÂÁö¾Ê½À´Ï´Ù.");
		
		
		System.out.println("¸ğµç ÀÚ·á¸¦ Çü½Ä¿¡ ¸Â°Ô ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
		System.out.println("ÀÌ¸§ : "+name);
		System.out.println("ÁÖ¼Ò : "+address);
		System.out.println("¿ìÆí¹øÈ£ : "+address_number);
		System.out.println("ÇÚµåÆù ¹øÈ£ : "+phone_number);
		System.out.println("Ç÷¾×Çü : "+bloodtype);
		System.out.println("»ıÀÏ : "+birth);
		System.out.println("¼ºº° : "+gender);
		
		/*Scanner sc = new Scanner(System.in);
		String input;
		Pattern pattern;
		Matcher m;
		
		System.out.println("ÀÌ¸§ : ");
		input = sc.nextLine();
		pattern = Pattern.compile("^[°¡-ÆR]{2,4}$");
		m = pattern.matcher(input);
		if(!m.matches()) {
			System.out.println("ÀÌ¸§ Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
			return;
		}
		
		System.out.println("ÁÖ¼Ò : ");
		input = sc.nextLine();
		pattern = Pattern.compile("^[°¡-ÆR]{2,4}µµ\\s+[°¡-ÆR]{2,4}½Ã\\s+[°¡-ÆR]{2,6}·Î\\s+\\d{2,4}$");
		m = pattern.matcher(input);
		if(!m.matches()) {
			System.out.println("ÁÖ¼Ò Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
			return;
		}
		
		System.out.println("¿ìÆí¹øÈ£ : ");
		input = sc.nextLine();
		pattern = Pattern.compile("^\\d{5}$");
		m = pattern.matcher(input);
		if(!m.matches()) {
			System.out.println("¿ìÆí¹øÈ£ Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
			return;
		}
		
		System.out.println("ÇÚµåÆù ¹øÈ£ : ");
		input = sc.nextLine();
		pattern = Pattern.compile("^01[01]-\\d{4}-\\d{4}$");
		m = pattern.matcher(input);
		if(!m.matches()) {
			System.out.println("ÇÚµåÆù ¹øÈ£ Çü½Ä¿¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
			return;
		}
		*/
		
	}

}
