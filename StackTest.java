package ������;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack st = new Stack();
		
		st.push("���");
		String e = (String) st.peek();
		if(st.empty()) System.out.println(e + "�� peek�� �� ������ ������ϴ�.");
		e = (String) st.pop();
		if(st.empty()) System.out.println(e + "�� pop�� �� ������ ������ϴ�.");
		
		st.push("����");
		st.push("�漺");
		System.out.println(st.search("�漺"));
		System.out.println(st.search("����"));
	}
}
