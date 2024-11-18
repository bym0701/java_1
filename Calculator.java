package 박유민;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

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
		text.addActionListener(this);
		

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
		String[] operator = {"+", "-", "*", "/"};
		String[] expression = {};
		int count = 0;
			for(int i = 1; i <= 9; i++) {
				if(event.getActionCommand().equals(Integer.toString(i))) {
					expression[count] = Integer.toString(i);
					count++;
				}
			}
			for(String i : operator) {
				if(event.getActionCommand().equals(i)) {
					expression[count] = i;
					count++;
				}
			}
			if(event.getActionCommand().equals("=")){
				Save(expression);
			}
	}
	public void Save(String[] expression) {
		try {
			PrintWriter out = new PrintWriter("Calculator.txt");
			out.print(expression);
			System.out.println("저장");
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int Calculate(String op, int x, int y) {
		int result = 0;
		if((x == 0 || y == 0)&& op == "/") {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		switch(op) {
		case "+" : result = x + y;
		case "-" : result = x - y;
		case "*" : result = x * y;
		case "/" : result = x / y;
		}
		return result;
	}
		
}