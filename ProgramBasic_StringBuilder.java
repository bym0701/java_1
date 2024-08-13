package ¹ÚÀ¯¹Î;

public class ProgramBasic_StringBuilder {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("hello");
		System.out.println("Old Capacity = "+ str1.capacity());
		str1.ensureCapacity(28);
		System.out.println("New Capacity = "+ str1. capacity());
		str1.ensureCapacity(33);
		System.out.println("New Capacity = "+ str1.capacity());
		
		StringBuilder str2 = new StringBuilder();
		System.out.println("Old Capacity = "+ str2.capacity());
		str2.ensureCapacity(40);
		System.out.println("New Capacity = "+ str2.capacity());
		
		//p.159-3
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(123);
		sb.append(33.333);
		sb.delete(4, 7);
		sb.replace(2, 7, "Love");
		System.out.println(sb);
		
		//p.160-1
		sb.reverse();
		String s1 = sb.substring(3);
		String s2 = sb.substring(3, 5);
		System.out.println(sb);
		System.out.println(s1);
		System.out.println(s2);
		
		//p.160-2
		StringBuilder sb3 = new StringBuilder("I Leve You.!");
		sb3.setCharAt(3, 'o');
		sb3.deleteCharAt(11);
		System.out.println(sb3);
		
		//p.160-3
		StringBuilder sb4 = new StringBuilder("Hi ");
		System.out.println("string = "+ sb4);
		sb4.append(123);
		System.out.println("After append = "+ sb4.toString());
		
	}
}
