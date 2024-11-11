package ¹ÚÀ¯¹Î;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramBasic_485 extends JFrame{
	JButton[] buttons;
	public static void main(String[] args) {
		ProgramBasic_485 app = new ProgramBasic_485("test");
	}
	public ProgramBasic_485(String s) {
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
		c.add(Box.createRigidArea(new Dimension(0,5)));
		
		
		buttons[1] = new JButton("   Button2    ");
		buttons[1].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[1]);
		c.add(Box.createVerticalGlue());
		
		buttons[2] = new JButton("      Buttons3      ");
		buttons[2].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[2]);
		
		pack();
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}