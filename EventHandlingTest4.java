package 박유민;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyActionHandler1 implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		System.out.println("press me 버튼이 눌렸습니다.");
	}
}

class MyActionHandler2 implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		System.out.println("'press me' button is clicked.");
	}
}

public class EventHandlingTest4 extends JFrame{
	public static void main(String[] args) {
		EventHandlingTest4 f = new EventHandlingTest4("title");
	}
	public EventHandlingTest4(String title) {
		super(title);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = this.getContentPane();
		JButton b = new JButton("press me");
		
		MyActionHandler1 handler = new MyActionHandler1();
		b.addActionListener(handler);
		MyActionHandler2 handler2 = new MyActionHandler2();
		b.addActionListener(handler2);
		
		c.add(b);
		
		this.setSize(200,200);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
