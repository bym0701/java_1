package ������;

public class ProgramBasic {
	public static void main(String[] args) {
		/*
		\//p.146-1
		String str1, str2, str3, str4, str5;
		char [] charArray = {'I', ' ', 'L', 'o', 'v', 'e', ' ', 'Y', 'o', 'u'};
		
		str1 = "Hi, Byeong Man";
		str2 = new String(str1);
		str3 = new String(charArray);
		str4 = new String(charArray, 2, 4); // 2���� 4����
		
		System.out.println(str1 + str2 + str3 + str4);
		
		//p.146-2
		char[] t = str1.toCharArray();
		for(int i = 0; i < t.length; i++) System.out.print(t[i]); //���ڿ� -> ���� �迭�� ��ȯ
		System.out.println();
		
		//p.147-1
		String str = "I lobe You";
		char[] t1 = str.toCharArray();
		t[4] = 'v';
		str = new String(t1);
		
		//p.147-2
		String Str1 = new String("I Love You!!");
		String Str2 = Str1;
		String Str3 = new String("I Love You!!");
		boolean retVal;
		
		retVal = Str1.equals( Str2 );
		System.out.println("Returned Value = " + retVal);
		
		retVal = Str1.equals( Str3 );
		System.out.println("Returnd Value = " + retVal);
		
		//p.148-1
		if(Str1 == Str2) System.out.println("true");
		if(Str1 == Str3) System.out.println("true"); //Str1�� 2�� ������ ��ü 3�� ������ ������ �ٸ� ��ü
		
		//p.148-2
		String Str4 = new String("I Hate You!!");
		
		if(Str1.compareTo(Str2)==0) System.out.println("Equal");
		else System.out.println("Not Equal");
		
		if(Str1.compareTo(Str4) > 0) System.out.println("Greater");
		else if(Str1.compareTo(Str4) < 0) System.out.println("Less");
		else System.out.println("Equal");
		//compareTo�� ����� ���� ��ġ ���� �˻� �μ��� �־��� ���ڿ����� ���� ������ ũ�� ��, ������ 0, ������ ��
		
		//p.149-1
		str1 = "abcisabcisabc";
		
		System.out.println(str1.indexOf("abc"));
		System.out.println(str1.indexOf('i'));
		System.out.println(str1.indexOf('i', 4));
		System.out.println(str1.lastIndexOf("abc"));
		System.out.println(str1.lastIndexOf('s'));
		System.out.println(str1.lastIndexOf('s', 8)); //���� �˻�
		
		//p.150-1
		str1.substring(5); //str1 ���ڿ� �ε��� 20���� �����ϴ� �κ� ���ڿ�
		str1.substring(0, 6); // str1 ���ڿ��� �ε��� 0���� 6������ �κ� ���ڿ�
		
		//p.150-2
		str1.concat("abcd"); // �� ���ڿ��� ���� �ϳ��� ���ڿ��� ���� ���
		
		//p.150-3
		str1.replace('e', 'E'); // ��� �ҹ��� e�� �빮�� E�� ġȯ
		
		//p.150-4
		String regExp = " |,|:|\\.";
		String words = "one two,three:four.five";
		String newStr = words.replaceAll(regExp, "-");
		System.out.println(newStr);
		
		//p.151-1
		String upperStr = words.toUpperCase();
		String lowerStr = words.toLowerCase();
		
		//p.151-2
		String str0 = "  this is a test ***    ";
		String str1 = str0.trim();
		System.out.println(str1);
		
		
		//p.151-3, p.152-1, p.152-2
		//String delimStr = " ";
		//String delimStr = "\\s+"; //�ϳ� �̻��� ���� ���ڷ� �и�
		//String delimStr = " |,|:|\\."; //�и����� '',',', ':', '.'
		String words = "minus one      two,three:four.five";
		String[] split = null;
		split = words.split(delimStr);
		for(String s : split) System.out.println("-" + s + "-");
		
		
		
		*/
		
		
		
		
		
		
	}
}
