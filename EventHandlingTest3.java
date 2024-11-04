package ������;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventHandlingTest3 extends JFrame{
	public static void main(String[] args) {
		EventHandlingTest3 f = new EventHandlingTest3("���� Ŭ����");
	}
	public EventHandlingTest3(String title) {
		super(title);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = this.getContentPane();
		JButton b = new JButton("press me");
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("press me ��ư�� ���Ƚ��ϴ�.");
			}
		});
		
		c.add(b);
		
		this.setSize(200, 200);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
