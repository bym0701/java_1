package test;

public class test {
	public static void main(String[] args) {
		//[1-1]
		int x=15;
		if(x > 10 && x < 20) System.out.println("[1-1]1.");
		
		char ch1 = 'x';
		if(ch1 != ' ' || ch1 != '\t') System.out.println("[1-1]2.");
		if(ch1 == 'x' || ch1 == 'X') System.out.println("[1-1]3.");
		
		char ch2 = '5';
		if('0' <= ch2 && ch2 <= '9') System.out.println("[1-1]4.");

		//ch1 = '_';
		if(('A' <= ch1 && ch1 <= 'Z') || ('a' <= ch1 && ch1 <= 'z')) System.out.println("[1-1]5.");//
		
		int year = 800;
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) System.out.println("[1-1]6.");
		
		boolean powerOn = false;
		if(!powerOn) System.out.println("[1-1]7.");
		
		String str1 = "yes";
		if(str1.equals("yes")) System.out.println("[1-1]8.");
		
		//[1-2]
		int sum1 = 0;
		for(int i = 1;  i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum1 += i;
			}
		}
		System.out.println("[1-2]" + sum1);
		
		//[1-4]
		//int sum2 = 0;
		//int count1 = 0;
		//for(int j = 1; sum2 <= 100; j++) {
		//	if(j % 2 == 1) j *= -1;
		//	sum2 += j;
		//	count1++;
		//}
		//System.out.println("[1-4]" + count1);
		
		//[1-5]
		System.out.println("[1-5]");
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i+j == 6) System.out.println(i + "+" + j + "= 6");
			}
		}
		
		//[1-6]
		//for(int y = 0; y<10; y++) {
		//	for(int x1 = 0; x1<=y; x1++)
		//		System.out.print("*");
		//	System.out.println();
		//}
		
		//int y = 0;
		//int x1 = 0;
		//while(y<10) {
		//	while(x1 <= y) {
		//		System.out.print("*");
		//		x1++;
		//	}
		//	y++;
		//	System.out.println();
		//}
		
		//[1-7]
		String str = "41389";
		int sum2 = 0;
		for(int i = 0; i<str.length(); i++) {
			
		}
		System.out.println("sum = " + sum2);
		
	}
}
