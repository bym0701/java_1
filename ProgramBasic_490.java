package ¹ÚÀ¯¹Î;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramBasic_490 extends JFrame{
	JButton[] buttons;
	public static void main(String[] args) {
		ProgramBasic_490 app = new ProgramBasic_490("test");
	}
	public ProgramBasic_490(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		buttons = new JButton[3];
		
		Container c = getContentPane();
		GroupLayout layout = new GroupLayout(c);
		c.setLayout(layout);
		
		JButton c1 = new JButton("Button1");
		JButton c2 = new JButton("Button2");
		JButton c3 = new JButton("Button3");
		JButton c4 = new JButton("Button4");
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addComponent(c1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout
						.Alignment.LEADING)
						.addComponent(c2)
						.addComponent(c4))
				.addComponent(c3));
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup
						(GroupLayout.Alignment.BASELINE)
						.addComponent(c1)
						.addComponent(c2)
						.addComponent(c3))
				.addComponent(c4));
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		pack();
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}