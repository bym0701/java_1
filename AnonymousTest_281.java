package ������;

public class AnonymousTest_281 {
	public void display(Greeting g) {
		System.out.println(g.message());
	}
	
	public static void main(String[] args) {
		
		AnonymousTest_281 ob = new AnonymousTest_281();
		
		ob.display(new Greeting() { //new��� ��Ʈ�ѿ���(?)
			
			@Override
			public String message() {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
}
interface Greeting{
	String message();
}
