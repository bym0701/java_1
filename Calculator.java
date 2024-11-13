package ¹ÚÀ¯¹Î;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	public static void main(String[] args) {
		Calculator cal = new Calculator("Calculator");
	}
	public Calculator(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = getContentPane();
		
		BoxLayout layout = new BoxLayout(c, BoxLayout.Y_AXIS);
		c.setLayout(layout);
		c.add(Box.createRigidArea(new Dimension(0, 5)));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		c.add(p1);
		c.add(p2);
		
		p1.setLayout(new GridLayout(1, 1, 5, 5));
		JTextField text = new JTextField();
		p1.add(text);

		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		p2.add(p3);
		p2.add(Box.createRigidArea(new Dimension(5, 0)));
		p2.add(p4);
		
		
		p3.setLayout(new GridLayout(3, 3, 5, 5));
		for(int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			p3.add(b);
			b.addActionListener(this);
		}
		
		p4.setLayout(new GridLayout(5, 1, 5, 5));
		String[] operator = {"+", "-", "*", "/", "="};
		
		for(String i : operator) {
			JButton btn = new JButton(i);
			p4.add(btn);
			btn.addActionListener(this);
		}
		
		pack();
		setSize(300,400);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		int num[] = {};
		String[] operator = {"+", "-", "*", "/", "="};
		String[] operators = {};
		int nc = 0, oc = 0;
		for(int i = 1; i <= 9; i++) {
			if(event.getActionCommand().equals(Integer.toString(i))) {
				num[nc] = i;
				nc++;
			}
		}
		for(String i : operator) {
			if(event.getActionCommand().equals("=")) {
				calculate(num, operators, nc, oc);
				break;
			}
			else if(event.getActionCommand().equals(i)) {
				operators[oc] = i;
				oc++;
			}
		}
		
	}
	public void calculate(int[] num, String[] operators, int nc, int oc) {
		int result;
		for(int i = 0; i <= oc; i++) {
			if(operators[i] == "*") {
				num[i] = num[i]*num[i+1];
				for(int j = i; j <= nc-1; j++)
					num[j] = num[j+1];
				nc--;
			}
			else if(operators[i] == "/") {
				num[i] = num[i]/num[i+1];
				for(int j = i; j <= nc-1; j++)
					num[j] = num[j+1];
				nc--;
			}
		}
		for(int i = 0; i <= oc; i++) {
			if(operators[i])
		}
	}
}