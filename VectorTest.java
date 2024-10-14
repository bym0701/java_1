package ¹ÚÀ¯¹Î;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("aaa");
		v.addElement("bbb");
		v.addElement("ccc");
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
