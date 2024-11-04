package ������;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventHandlingTest2 extends JFrame implements ActionListener{
	public static void main(String[] args) {
		EventHandlingTest2 f = new EventHandlingTest2("JFrame ��� Ŭ����");
	}
	public EventHandlingTest2(String title) {
		super(title);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = this.getContentPane();
		JButton b = new JButton("press me");
		
		b.addActionListener(this);
		
		c.add(b);
		
		this.setSize(200,200);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		System.out.println("press me ��ư�� ���Ƚ��ϴ�.");
	}
}
