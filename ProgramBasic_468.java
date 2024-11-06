package ¹ÚÀ¯¹Î;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramBasic_468 extends JFrame{
	public static void main(String[] args) {
		ProgramBasic_468 app = new ProgramBasic_468("title");
	}
	public ProgramBasic_468(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		JButton[] buttons = new JButton[5];
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button" + (i+1));
		//	c.add(buttons[i]);
		}
		
		c.add(buttons[0], BorderLayout.EAST);
		c.add(buttons[1], BorderLayout.WEST);
		c.add(buttons[2], BorderLayout.SOUTH);
		c.add(buttons[3], BorderLayout.NORTH);
		c.add(buttons[4], BorderLayout.CENTER);
		
		setSize(200,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
