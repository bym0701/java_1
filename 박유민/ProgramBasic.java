package 박유민;

public class ProgramBasic {
	public static void main(String[] args) {
		/*
		\//p.146-1
		String str1, str2, str3, str4, str5;
		char [] charArray = {'I', ' ', 'L', 'o', 'v', 'e', ' ', 'Y', 'o', 'u'};
		
		str1 = "Hi, Byeong Man";
		str2 = new String(str1);
		str3 = new String(charArray);
		str4 = new String(charArray, 2, 4); // 2부터 4까지
		
		System.out.println(str1 + str2 + str3 + str4);
		
		//p.146-2
		char[] t = str1.toCharArray();
		for(int i = 0; i < t.length; i++) System.out.print(t[i]); //문자열 -> 문자 배열로 변환
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
		if(Str1 == Str3) System.out.println("true"); //Str1과 2는 동일한 객체 3은 내용은 같지만 다른 객체
		
		//p.148-2
		String Str4 = new String("I Hate You!!");
		
		if(Str1.compareTo(Str2)==0) System.out.println("Equal");
		else System.out.println("Not Equal");
		
		if(Str1.compareTo(Str4) > 0) System.out.println("Greater");
		else if(Str1.compareTo(Str4) < 0) System.out.println("Less");
		else System.out.println("Equal");
		//compareTo를 사용해 값의 일치 여부 검사 인수로 주어진 문자열보다 사전 순서상 크면 양, 같으면 0, 작으면 음
		
		//p.149-1
		str1 = "abcisabcisabc";
		
		System.out.println(str1.indexOf("abc"));
		System.out.println(str1.indexOf('i'));
		System.out.println(str1.indexOf('i', 4));
		System.out.println(str1.lastIndexOf("abc"));
		System.out.println(str1.lastIndexOf('s'));
		System.out.println(str1.lastIndexOf('s', 8)); //문자 검색
		
		//p.150-1
		str1.substring(5); //str1 문자열 인덱스 20부터 시작하는 부분 문자열
		str1.substring(0, 6); // str1 문자열의 인덱스 0부터 6까지의 부분 문자열
		
		//p.150-2
		str1.concat("abcd"); // 두 문자열을 합쳐 하나의 문자열로 만들 경우
		
		//p.150-3
		str1.replace('e', 'E'); // 모든 소문자 e를 대문자 E로 치환
		
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
		//String delimStr = "\\s+"; //하나 이상의 공백 문자로 분리
		//String delimStr = " |,|:|\\."; //분리문자 '',',', ':', '.'
		String words = "minus one      two,three:four.five";
		String[] split = null;
		split = words.split(delimStr);
		for(String s : split) System.out.println("-" + s + "-");
		
		
		
		*/
		
		
		
		
		
		
	}
}
