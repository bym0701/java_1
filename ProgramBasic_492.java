package ¹ÚÀ¯¹Î;

import java.awt.Component;
import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ProgramBasic_492 extends JFrame{
	JButton[] buttons;
	public static void main(String[] args) {
		ProgramBasic_492 app = new ProgramBasic_492("test");
	}
	public ProgramBasic_492(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		buttons = new JButton[3];
		
		Container c = getContentPane();
		GroupLayout layout = new GroupLayout(c);
		c.setLayout(layout);
		
		SpringLayout layout1 = new SpringLayout();
		c.setLayout(layout1);
		
		Component left = new JLabel("Left");
		c.add(left);
		Component right = new JTextField(15);
		c.add(right);
		
		layout1.putConstraint(SpringLayout.WEST, left, 10, SpringLayout.WEST, c);
		layout1.putConstraint(SpringLayout.NORTH, left, 25, SpringLayout.NORTH, c);
		layout1.putConstraint(SpringLayout.NORTH, right, 25, SpringLayout.NORTH, c);
		layout1.putConstraint(SpringLayout.WEST, right, 20, SpringLayout.EAST, left);
		layout1.putConstraint(SpringLayout.EAST, c, 20, SpringLayout.EAST, right);
		
		setSize(200, 200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}