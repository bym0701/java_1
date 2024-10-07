package ������;

public class GenericStackTest {
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.Push(3);
		int x = stack.Pop();
		System.out.println(x);
	}
}
class MyStack<T>{
	final int size;
	T[] items;
	int top;
	
	public MyStack() {this(10);}
	public MyStack(int s) {
		size = s > 0 ? s : 10;
		items = (T [])new Object[s];
		top = -1;
	}
	public void Push(T item) {
		if(top == size - 1) throw new FullException("������ �� �� �־� " + item + "�� ������� �� �����ϴ�.");
		items[++top] = item;
	}
	public T Pop() {
		if(top == -1) throw new EmptyException("������ ��� �־� �׸��� ������ �� �� �����ϴ�.");
		return items[top--];
	}
}
class FullException extends RuntimeException{
	public FullException() {
		this("���� �� ��");
	}
	
	public FullException(String exception) {
		super(exception);
	}
}

class EmptyException extends RuntimeException{
	public EmptyException() {
		this("���� ��");
	}
	
	public EmptyException(String exception) {
		super(exception);
	}
}