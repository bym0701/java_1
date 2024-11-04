package ¹ÚÀ¯¹Î;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hello extends JFrame{
/*	public static void main(String[] args) {
		JFrame f = new JFrame("title");
		JPanel p = new JPanel();
		JButton b = new JButton("press me");
		
		p.add(b);
		f.setContentPane(p);
		
		f.setSize(200, 200);
		f.setLocation(300, 300);
		f.setVisible(true);
	} */
/*	public static void main(String[] args) {
		JFrame f = new JFrame("title");
		Container c = f.getContentPane();
		JButton b = new JButton("press me");
		
		c.add(b);
		
		f.setSize(200, 200);
		f.setLocation(300, 300);
		f.setVisible(true);
	} */
/*	public static void main(String[] args) {
		Hello f = new Hello("title");
		Container c = f.getContentPane();
		JButton b = new JButton("press me");
		
		c.add(b);
		
		f.setSize(200, 200);
		f.setLocation(300, 300);
		f.setVisible(true);
	}
	public Hello(String title) {
		super(title);
	} */
	public static void main(String[] args) {
		Hello f = new Hello("title");
	}
	public Hello(String title) {
		super(title);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = this.getContentPane();
		JButton b = new JButton("press me");
		
		c.add(b);
		
		this.setSize(200, 200);
		this.setLocation(300, 300);
		this.setVisible(true);
	}
}
