package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");	
		list.add("eee");
		
		//1
		System.out.println("���� ������: "+ list);
		
		//2
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Index: " + i + " - data: " + list.get(i));
		}
		
		//3
		for(String str : list) {
			System.out.println("Data: " + str);
		}
		
		//4
		for(Iterator<String> it = list.iterator(); it.hasNext();) {
			System.out.println("������: " + it.next());
		}
		
		//5
		String[] simpleArray = list.toArray(new String[list.size()]);
		System.out.println("��ȯ �迭: " + Arrays.toString(simpleArray));

	}

}
