package ¹ÚÀ¯¹Î;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ProgramBasic_482 extends JFrame{ //~492
	JButton[] buttons;
	public static void main(String[] args) {
		ProgramBasic_482 app = new ProgramBasic_482("test");
	}
	public ProgramBasic_482(String s) {
		super(s);
		initializeComponents();
	}
/*	private void initializeComponents() {
		buttons = new JButton[5];
		
		Container c = getContentPane();
		
		c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
		c.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button" + (i+1));
			c.add(buttons[i], "btn" + (i+1));
		}
		
		pack();
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}*/
/*	private void initializeComponents() {
		buttons = new JButton[3];
		
		Container c = getContentPane();
		
		c.setLayout(new BoxLayout(c, BoxLayout.PAGE_AXIS));
		
		buttons[0] = new JButton("Button1");
		buttons[0].setAlignmentX(Component.LEFT_ALIGNMENT);
		c.add(buttons[0]);
		buttons[1] = new JButton("    Button2    ");
		buttons[1].setAlignmentX(Component.LEFT_ALIGNMENT);
		c.add(buttons[1]);
		buttons[2] = new JButton("      Button3      ");
		buttons[2].setAlignmentX(Component.LEFT_ALIGNMENT);
		c.add(buttons[2]);
		
		pack();
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	} */
/*	private void initializeComponents() {
		buttons = new JButton[3];
		
		Container c = getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.PAGE_AXIS));
		
		buttons[0] = new JButton("Button1");
		buttons[0].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[0]);
		c.add(Box.createRigidArea(new Dimension(0,5)));
		
		buttons[1] = new JButton("    Button2    ");
		buttons[1].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[1]);
		c.add(Box.createVerticalGlue());
		
		buttons[2] = new JButton("      Button3      ");
		buttons[2].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[2]);
		
		
		pack();
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	} */
/*	private void initializeComponents() {
		buttons = new JButton[3];
		
		Container c = getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.PAGE_AXIS));
		
		buttons[0] = new JButton("Button1");
		buttons[0].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[0]);
		c.add(Box.createRigidArea(new Dimension(0,5)));
		
		buttons[1] = new JButton("Button2");
		buttons[1].setMinimumSize(new Dimension(200,100));
		buttons[1].setPreferredSize(new Dimension(200,100));
		buttons[1].setMaximumSize(new Dimension(300,100));
		buttons[1].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[1]);
		c.add(Box.createVerticalGlue());
		
		buttons[2] = new JButton("Button3");
		buttons[2].setAlignmentX(Component.CENTER_ALIGNMENT);
		c.add(buttons[2]);
		
		
		pack();
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	} */
/*	private void initializeComponents() {
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
				.addGroup(layout.createParallelGroup(GroupLayout.
						Alignment.LEADING)
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
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	} */
	private void initializeComponents() {
		buttons = new JButton[3];
		
		Container c = getContentPane();
		
		SpringLayout layout = new SpringLayout();
		c.setLayout(layout);
		
		Component left = new JLabel("Left");
		c.add(left);
		Component right = new JTextField(15);
		c.add(right);
		layout.putConstraint(SpringLayout.WEST, left, 10, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, left, 25, SpringLayout.NORTH, c);
		layout.putConstraint(SpringLayout.NORTH, right, 25, SpringLayout.NORTH, c);
		layout.putConstraint(SpringLayout.EAST, c, 20, SpringLayout.EAST, right);
		layout.putConstraint(SpringLayout.EAST, c, 20, SpringLayout.EAST, right);
		
		setSize(300,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

} 
	