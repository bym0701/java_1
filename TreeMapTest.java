package ¹ÚÀ¯¹Î;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Catt, String> trmap = new TreeMap<Catt, String>();
		
		trmap.put(new Catt(50), "Fat");
		trmap.put(new Catt(30), "Normal");
		trmap.put(new Catt(20), "Slim");
		trmap.put(new Catt(60), "Big");
		
		Set<Catt> ks = trmap.keySet();
		
		for(Catt key:ks) {
			System.out.println(key + "==>" + trmap.get(key));
		}
	}
}
