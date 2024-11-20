package Test;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
	private ArrayList<String> tmp = new ArrayList<String>();
	//ArrayList로 하기
	public void actionPerformed(ActionEvent event) {
		String[] operator = {"+", "-", "*", "/"};
		int result = 0;
			for(int i = 1; i <= 9; i++) {
				if(event.getActionCommand().equals(Integer.toString(i))) {
					//text에 i출력
					tmp.add(Integer.toString(i));
				}
			}
			
			for(String i : operator) {
				if(event.getActionCommand().equals(i)) {
					//text에 i출력
					tmp.add(i);
				}
			}
			if(event.getActionCommand().equals("=")){
				Save_Expression();
				result = Load_Expression();
				//result 출력
			}
	}
	public void Save_Expression() {
		try {
			PrintWriter out = new PrintWriter("Calculator.txt");
			out.print(tmp);
			System.out.print("저장");
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int Load_Expression() {
		Expression ep = new Expression();
//		String[] operator = {"+", "-", "*", "/"};
		try {
			File loadFile = new File("Calculator.txt");
			Scanner sc= new Scanner(loadFile);
			sc.useDelimiter(",");
			//숫자, 연산자로 나눠서 ep의 num과 operator에 저장
			//ep의 num과 operator을 ArrayList로 바꿔도 될듯
			ep.set_num(sc.nextInt());
			ep.set_nc();
			ep.set_operators(sc.next());
			ep.set_oc();
			sc.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return ep.Calculate(); //계산하기
	}
	
}