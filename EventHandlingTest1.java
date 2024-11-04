package ������;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventHandlingTest1 extends JFrame{
	public static void main(String[] args) {
		EventHandlingTest1 f = new EventHandlingTest1("���� Ŭ���� �̿�");
	}
	public EventHandlingTest1(String title) {
		super(title);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = this.getContentPane();
		JButton b = new JButton("press me");
		MyActionHandler handler = new MyActionHandler();
		b.addActionListener(handler);
		
		c.add(b);
		
		this.setSize(200,200);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class MyActionHandler implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		System.out.println("press me ��ư�� ���Ƚ��ϴ�.");
	}
}
