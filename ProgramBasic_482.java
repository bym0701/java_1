package ������;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramBasic_482 extends JFrame{
	JButton[] buttons;
	public static void main(String[] args) {
		ProgramBasic_482 app = new ProgramBasic_482("test");
	}
	public ProgramBasic_482(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		buttons = new JButton[5];
		
		Container c = getContentPane();
		
		c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
		
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
