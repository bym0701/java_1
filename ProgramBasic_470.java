package ¹ÚÀ¯¹Î;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramBasic_470 extends JFrame{
	public static void main(String[] args) {
		ProgramBasic_470 app = new ProgramBasic_470("title"); 
	}
	public ProgramBasic_470(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		JButton[] buttons = new JButton[5];
		
		Container c = getContentPane();
	//	c.setLayout(new GridLayout(3,2));
	//	c.setLayout(new GridLayout(3,2,5,5));
		GridLayout layout = new GridLayout(3, 2);
		layout.setHgap(5);
		layout.setVgap(5);
		c.setLayout(layout);
		
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
