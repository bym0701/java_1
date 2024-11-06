package ¹ÚÀ¯¹Î;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramBasic_466 extends JFrame{
	public static void main(String[] args) {
		ProgramBasic_466 app = new ProgramBasic_466("title");
	}
	public ProgramBasic_466(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		JButton[] buttons = new JButton[5];
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button" + (i+1));
			c.add(buttons[i]);
		}
		setSize(200,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
