package 박유민;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Catt implements Comparable{
	int size;
	public Catt(int s) {
		size = s;
	}
	public String toString() {
		return size + "";
	}
	public int hashCode() {
		return size % 100;
	}
	public boolean equals(Object ob) {
		Catt other = (Catt) ob;
		return other.size == this.size ? true : false;
	}
	@Override
	public int compareTo(Object o) {
		return size - ((Catt) o).size;
	}
}
public class PriorityTest {
	public static void main(String[] args) {
		Queue<Catt> catPriorityQueue = new PriorityQueue<Catt>(3);
		catPriorityQueue.add(new Catt(5));
		catPriorityQueue.add(new Catt(3));
		catPriorityQueue.add(new Catt(7));
		System.out.println("크기 순");
		for(int i = 0; i < 3; i++) {
			Catt in = catPriorityQueue.poll();
			System.out.println("Processing Cat:" + in);
		}
		
		final Comparator<Catt> idComparator = new Comparator<Catt>() {
			public int compare(Catt c1, Catt c2) {
				return c2.size - c1.size;
			}
		};
		
		Queue<Catt> catPriorityQueue2 = new PriorityQueue<Catt>(3, idComparator);
		catPriorityQueue2.add(new Catt(5));
		catPriorityQueue2.add(new Catt(3));
		catPriorityQueue2.add(new Catt(7));
		System.out.println();
		System.out.println("크기 역순");
		
		for(int i = 0; i < 3; i++) {
			Catt in = catPriorityQueue2.poll();
			System.out.println("Processing Cat:" + in);
		}
	}
	
}
