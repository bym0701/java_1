package ¹ÚÀ¯¹Î;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Cat> cset = new HashSet<Cat>();
	/*	cset.add(new Cat(2));
		cset.add(new Cat(1));
		cset.add(new Cat(3));
		cset.add(new Cat(5));
		cset.add(new Cat(4)); */
	/*	cset.add(new Cat(2));
		cset.add(new Cat(1));
		cset.add(new Cat(3));
		cset.add(new Cat(5));
		cset.add(new Cat(4));
		cset.add(new Cat(2)); */
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
/*
class Cat{
	int size;
	
	public Cat(int s) {
		size = s;
	}
	public String toString() {
		return size + "";
	}
} /*