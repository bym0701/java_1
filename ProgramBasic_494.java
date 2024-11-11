package ¹ÚÀ¯¹Î;

import java.awt.Component;
import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ProgramBasic_494 extends JFrame{
	JButton[] buttons;
	public static void main(String[] args) {
		ProgramBasic_494 app = new ProgramBasic_494("test");
	}
	public ProgramBasic_494(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		
		Container c = getContentPane();
		
		JButton button1 = new JButton("One");
		JButton button2 = new JButton("Two");
		JButton button3 = new JButton("Three");
		c.setLayout(null);
		
		c.add(button1);
		c.add(button2);
		c.add(button3);
		
		button1.setBounds(30, 50, 100, 20);
		button2.setBounds(30, 80, 100, 20);
		button3.setBounds(150, 50, 100, 20);
		
		setSize(300, 200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}