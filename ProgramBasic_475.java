package 박유민;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramBasic_475 extends JFrame{
	public static void main(String[] args) {
		ProgramBasic_475 app = new ProgramBasic_475("title");
	}
	public ProgramBasic_475(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		Container pane = getContentPane();
		
		JButton button;
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		button = new JButton("버튼 1");
		c.gridx = 0;
		c.gridy = 0;
		pane.add(button, c);
		c.weightx = 0.2;
		c.fill = GridBagConstraints.HORIZONTAL;
		
		button = new JButton("버튼 2");
		c.gridx = 1;
		c.gridy = 0;
		pane.add(button, c);
		
		button = new JButton("버튼 3");
		c.gridx = 2;
		c.gridy = 0;
		pane.add(button, c);
		
		button = new JButton("Button 4");
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 3;
		pane.add(button, c);
		
		button = new JButton("Button 5");
		c.gridx = 1;
		c.gridy = 2;
		c.ipady = 20;
		c.gridwidth = 1;
		pane.add(button, c);
		
		button = new JButton("Button 6");
		c.insets = new Insets(0,10,10,0);
		c.gridx = 1;
		c.gridy = 3;
		pane.add(button, c);
		
		setSize(200,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
