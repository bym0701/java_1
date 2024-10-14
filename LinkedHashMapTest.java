package ¹ÚÀ¯¹Î;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<Catt, String> lhmap = new LinkedHashMap<Catt, String>();
		
		lhmap.put(new Catt(50), "Fat");
		lhmap.put(new Catt(30), "Normal");
		
	}
}
