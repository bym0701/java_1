package ¹ÚÀ¯¹Î;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramBasic_479 extends JFrame implements ActionListener{
	JButton[] buttons;
	public static void main(String[] args) {
		ProgramBasic_479 app = new ProgramBasic_479("test");
	}
	public ProgramBasic_479(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		buttons = new JButton[5];
		
		Container c = getContentPane();
		c.setLayout(new CardLayout());
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button" + (i+1));
			buttons[i].addActionListener(this);
			c.add(buttons[i], "btn" + (i+1));
		}
		setSize(200,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		Container c = getContentPane();
		CardLayout layout = (CardLayout) c.getLayout();
		if(e.getSource() == buttons[1]) {
			layout.last(c);
		}
		else if(e.getSource() == buttons[4]) {
			layout.previous(c);
		}
		else if(e.getSource() == buttons[3]) {
			layout.show(c, "btn1");
		}
		else {
			layout.next(c);
		}
	}
}
