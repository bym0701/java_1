package ¹ÚÀ¯¹Î;

import java.awt.ComponentOrientation;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramBasic_483 extends JFrame{
	JButton[] buttons;
	public static void main(String[] args) {
		ProgramBasic_483 app = new ProgramBasic_483("test");
	}
	public ProgramBasic_483(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		buttons = new JButton[5];
		
		Container c = getContentPane();
		
		c.setLayout(new BoxLayout(c, BoxLayout.PAGE_AXIS));
		c.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button " + (i+1));
			c.add(buttons[i], "btn"+(i+1));
		}
		
		pack();
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}