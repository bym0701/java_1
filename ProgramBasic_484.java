package ¹ÚÀ¯¹Î;

import java.awt.Component;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramBasic_484 extends JFrame{
	JButton[] buttons;
	public static void main(String[] args) {
		ProgramBasic_484 app = new ProgramBasic_484("test");
	}
	public ProgramBasic_484(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		buttons = new JButton[3];
		
		Container c = getContentPane();
		
		c.setLayout(new BoxLayout(c, BoxLayout.PAGE_AXIS));
		
		buttons[0] = new JButton("Button1");
		buttons[0].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[0]);
		buttons[1] = new JButton("   Button2   ");
		buttons[1].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[1]);
		buttons[2] = new JButton("     Buttons 3     ");
		buttons[2].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[2]);
		
		pack();
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}