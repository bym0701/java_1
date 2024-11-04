package 박유민;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Hello_453 extends JFrame implements ActionListener{
	JButton b;
	JTextField t;
	public static void main(String[] args) {
		Hello_453 app = new Hello_453("test");
	}
	public Hello_453(String title) {
		super(title);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		b = new JButton("press me");
		b.setActionCommand("on");
		b.addActionListener(this);
		t = new JTextField(10);
		t.addActionListener(this);
		c.add(b);
		c.add(t);
		
		this.setSize(200,200);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == b) {
			if(event.getActionCommand() == "on") {
				System.out.println("on 상태임");
				((JButton)event.getSource()).setActionCommand("off");
			}
			else {
				System.out.println("off 상태임");
				((JButton)event.getSource()).setActionCommand("on");
			}
		}
		else if(event.getSource() == t) {
			System.out.println(event.getActionCommand());
		}
	}
}
