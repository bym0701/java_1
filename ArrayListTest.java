package ������;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add(2, "ccc");
		list.add("ddd");
		
		System.out.println("���� ������ : " + list);//1
		
		int pos = list.indexOf("bbb");
		System.out.println("bbb�� ��ġ : " + pos);
		
		boolean check1 = list.isEmpty();
		boolean check2 = list.contains("ddd");
		System.out.println("��� ���� : " + check1 + "���� ���� : " + check2);
		
		int size = list.size();
		System.out.println("����Ʈ�� ũ�� : " + size);
		
		String item = list.get(0);
		System.out.println("0��° ��ġ ������ : " + item);
		
		System.out.println("������ �ݺ� ó�� - ù ��° ���");
		
		for(int i = 0; i < list.size(); i++) {//2
			System.out.println("Index: " + i + " - item: " + list.get(i));
		}
		
		System.out.println("������ �ݺ� ó�� - �� ��° ���");
		
		for(String str : list) {//3
			System.out.println("Item is: " + str);
		}
		
		System.out.println("������ �ݺ� ó�� - �� ��° ���");
		
		for(Iterator<String> it = list.iterator(); it.hasNext();) {//4
			System.out.println("������ : " + it.next());
		}
		
		list.set(1, "eee");
		System.out.println("���� �� ����Ʈ : " + list);
		
		list.remove(0);
		list.remove("ccc");
		System.out.println("����Ʈ�� ���� ���� : " + list);
		
		String[] simpleArray = list.toArray(new String[list.size()]);//5
		System.out.println("��ȯ �迭 : " + Arrays.toString(simpleArray));
	}
}
