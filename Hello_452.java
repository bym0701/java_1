package ¹ÚÀ¯¹Î;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Hello_452 extends JFrame implements ActionListener{
	JButton b;
	JTextField t;
	public static void main(String[] args) {
		Hello_452 app = new Hello_452("test");
	}
	public Hello_452(String title) {
		super(title);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		b = new JButton("press me");
		b.addActionListener(this);
		t = new JTextField(100);
		
		t.addActionListener(this);
		c.add(b);
		c.add(t);
		
		this.setSize(200,200);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		System.out.println(event.getActionCommand());
	}
	
}
