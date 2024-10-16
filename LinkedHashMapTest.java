package ¹ÚÀ¯¹Î;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<Catt, String> lhmap = new LinkedHashMap<Catt, String>();
		
		lhmap.put(new Catt(50), "Fat");
		lhmap.put(new Catt(30), "Normal");
		lhmap.put(new Catt(20), "Slim");
		lhmap.put(new Catt(60), "Big");
		
		Set<Catt> ks = lhmap.keySet();
		
		for(Catt key:ks) {
			System.out.println(key + " ==> " + lhmap.get(key));
		}
	}
}
