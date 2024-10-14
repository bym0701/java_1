package ¹ÚÀ¯¹Î;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap mapH = new HashMap();
		
		mapH.put(new Catt(50), "1");
		mapH.put(new Catt(30), "2");
		mapH.put(new Catt(20), "3");
		mapH.put(new Catt(60), "4");
		
		for(Object s : mapH.keySet()) {
			System.out.println(mapH.get(s));
		}
		
		Map mapT = new TreeMap();
		mapT.put("a", "1");
		mapT.put("b", "2");
		mapT.put("c", "3");
		mapT.put("d", "4");
		
		for(Object ob : mapT.keySet()) {
			System.out.println(ob);
		}
		
	}
}
