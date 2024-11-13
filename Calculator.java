package ������;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		JButton b = new JButton();
		p1.add(b);
		
		/*b��ġ�� ���ڶ� ������ ���� ������ ���� ��Ÿ���� �ϱ�
		 * = ��ư ������ ������ ���� ������ ����
		 * = ��ư ������ ���� ���ǰ� b��ġ�� �� ���
		 * 0���� ������ ���ϰ� �ϱ�
		*/
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		p2.add(p3);
		p2.add(Box.createRigidArea(new Dimension(5, 0)));
		p2.add(p4);
		
		
		p3.setLayout(new GridLayout(3, 3, 5, 5));
		JButton b1 = new JButton("1");
		p3.add(b1); b1.addActionListener(this);
		JButton b2 = new JButton("2");
		p3.add(b2);
		JButton b3 = new JButton("3");
		p3.add(b3);
		JButton b4 = new JButton("4");
		p3.add(b4);
		JButton b5 = new JButton("5");
		p3.add(b5);
		JButton b6 = new JButton("6");
		p3.add(b6);
		JButton b7 = new JButton("7");
		p3.add(b7);
		JButton b8 = new JButton("8");
		p3.add(b8);
		JButton b9 = new JButton("9");
		p3.add(b9);
		
		p4.setLayout(new GridLayout(5, 1, 5, 5));
		JButton btn1 = new JButton("+");
		p4.add(btn1);

		JButton btn2 = new JButton("-");
		p4.add(btn2);
		
		JButton btn3 = new JButton("*");
		p4.add(btn3);
		
		JButton btn4 = new JButton("/");
		p4.add(btn4);
		
		JButton btn5 = new JButton("=");
		p4.add(btn5);
		
		pack();
		setSize(300,400);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		
	}
}