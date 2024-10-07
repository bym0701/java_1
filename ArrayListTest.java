package 박유민;

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
		
		System.out.println("구성 데이터 : " + list);//1
		
		int pos = list.indexOf("bbb");
		System.out.println("bbb의 위치 : " + pos);
		
		boolean check1 = list.isEmpty();
		boolean check2 = list.contains("ddd");
		System.out.println("비어 있음 : " + check1 + "포함 여부 : " + check2);
		
		int size = list.size();
		System.out.println("리스트의 크기 : " + size);
		
		String item = list.get(0);
		System.out.println("0번째 위치 데이터 : " + item);
		
		System.out.println("데이터 반복 처리 - 첫 번째 방법");
		
		for(int i = 0; i < list.size(); i++) {//2
			System.out.println("Index: " + i + " - item: " + list.get(i));
		}
		
		System.out.println("데이터 반복 처리 - 두 번째 방법");
		
		for(String str : list) {//3
			System.out.println("Item is: " + str);
		}
		
		System.out.println("데이터 반복 처리 - 세 번째 방법");
		
		for(Iterator<String> it = list.iterator(); it.hasNext();) {//4
			System.out.println("데이터 : " + it.next());
		}
		
		list.set(1, "eee");
		System.out.println("수정 후 리스트 : " + list);
		
		list.remove(0);
		list.remove("ccc");
		System.out.println("리스트의 최종 내용 : " + list);
		
		String[] simpleArray = list.toArray(new String[list.size()]);//5
		System.out.println("변환 배열 : " + Arrays.toString(simpleArray));
	}
}
