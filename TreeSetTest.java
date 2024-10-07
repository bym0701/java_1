package ¹ÚÀ¯¹Î;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Cat> cset = new TreeSet<Cat>();
		Cat c = new Cat(2);
		cset.add(c);
		cset.add(new Cat(1));
		cset.add(new Cat(3));
		cset.add(new Cat(5));
		cset.add(new Cat(4));
		cset.add(c);
		Iterator<Cat> iterator = cset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + "");
		}
	}
}
class Cat implements Comparable{
	int size;
	
	public Cat(int s) {
		size = s;
	}
	public String toString() {
		return size + "";
	}
	
	@Override
	public int compareTo(Object o) {
		return size - ((Cat) o).size;
	}
}