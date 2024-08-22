package ¹ÚÀ¯¹Î;

public class InnerTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
	//	Outer.Inner inner = outer.new Inner();
	//	inner.print();
		outer.display_Inner();
	}
}

/*
class Outer{
	int num = 10;
	
	class Inner{
		public void print() {
			System.out.println("This is an inner class : " + num);
		}
	}
	
	void display_Inner() {
		Inner inner = new Inner();
		inner.print();
	}
} */
/*
class Outer{
	int num = 10;
	
	class Inner{
		private int x = 5;
		public void print() {
			System.out.println("This is an inner class : " + num);
		}
	}
	
	void display_Inner() {
		Inner inner = new Inner();
		System.out.println(inner.x);
		inner.print();
	}
}*/

class Outer{
	int num = 10;
	
	void display_Inner() {
		class Inner{
			private int x = 5;
			public void print() {
				System.out.println("This is an inner class : " + num);
			}
		}
		
		Inner inner = new Inner();
		System.out.println(inner.x);
		inner.print();
	}
}
