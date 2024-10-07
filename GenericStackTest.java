package 박유민;

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
		if(top == size - 1) throw new FullException("스택이 꽉 차 있어 " + item + "을 집어넣을 수 없습니다.");
		items[++top] = item;
	}
	public T Pop() {
		if(top == -1) throw new EmptyException("스택이 비어 있어 항목을 끄집어 낼 수 없습니다.");
		return items[top--];
	}
}
class FullException extends RuntimeException{
	public FullException() {
		this("스택 꽉 참");
	}
	
	public FullException(String exception) {
		super(exception);
	}
}

class EmptyException extends RuntimeException{
	public EmptyException() {
		this("스택 빔");
	}
	
	public EmptyException(String exception) {
		super(exception);
	}
}