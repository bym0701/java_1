package ¹ÚÀ¯¹Î;

import java.util.Iterator;
import java.util.Vector;

public class UserExceptionTest_324 {
	public static void main(String[] args) {
		
		Vector<Double> v = new Vector<Double>();
		v.add(4.5);
		v.add(3.4);
		v.add(2.9);
		Iterator<Double> it = v.iterator();
		
		double sum = 0.0, d;
		while(it.hasNext()) {
			d = it.next();
			sum += d;
		}
		System.out.println(sum);
	}
}
