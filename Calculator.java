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
	private ArrayList<String> tmp = new ArrayList<String>();
	private JTextField text = new JTextField();
	private String[] operator = {"+", "-", "*", "/", "=", "c"};
    
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
		p1.add(text);
		text.addActionListener(this);
		

		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		p2.add(p3);
		p2.add(Box.createRigidArea(new Dimension(5, 0)));
		p2.add(p4);
		
		p3.setLayout(new GridLayout(4, 3, 5, 5));
		for(int i = 0; i < 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			p3.add(b);
			b.addActionListener(this);
		}
		
		p4.setLayout(new GridLayout(6, 1, 5, 5));
		
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
		int result;
			for(int i = 0; i <= 9; i++) {
				if(event.getActionCommand().equals(Integer.toString(i))) {
					text.setText(text.getText() + event.getActionCommand());
					tmp.add(Integer.toString(i));
				}
			}
			
			for(String i : operator) {
				if(event.getActionCommand().equals(i)) {
					text.setText(text.getText() +" "+ event.getActionCommand() +" ");
					tmp.add(i);
				}
			}
			if(event.getActionCommand().equals("=")){
				Save_Expression();
				result = LoadandCalculate_Expression();
				text.setText(Integer.toString(result));
			}
			else if(event.getActionCommand().equals("c")) {
				tmp.clear();
				text.setText("");
			}
	}
	
	public void Save_Expression() {
		try {
			PrintWriter out = new PrintWriter("Calculator.txt");
			for(int i = 0; i < tmp.size(); i++) {
				out.print(tmp.get(i));
			}
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int LoadandCalculate_Expression() {
		String tmp;
	    ArrayList<Integer> num = new ArrayList<Integer>();
	    ArrayList<String> operators = new ArrayList<String>();
		try {
			File loadFile = new File("Calculator.txt");
			Scanner sc= new Scanner(loadFile);
			while (sc.hasNext()) {
				tmp = sc.next();
				for(String i : operator) {
					if(i == tmp) {
						operators.add(tmp);
					}
					else {
						num.add(Integer.parseInt(tmp));
					}
				}
				
			}
			sc.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return Calculate(num, operators);
	}
	
	public int Calculate(ArrayList<Integer> num, ArrayList<String> operators) {
		int tmp = 0;
		operators.remove("=");
        while (operators.contains("*") || operators.contains("/")) {
            for (int i = 0; i < operators.size(); i++) {
                if (operators.get(i).equals("*")) {
                    tmp = num.get(i) * num.get(i + 1);
                    num.set(i, tmp);
                    num.remove(i + 1);
                    operators.remove(i);
                } 
                else if (operators.get(i).equals("/")) {
                    if (num.get(i + 1) == 0) {
                        throw new ArithmeticException("0으로 나눌 수 없습니다.");
                    }
                    tmp = num.get(i) / num.get(i + 1);
                    num.set(i, tmp);
                    num.remove(i + 1);
                    operators.remove(i);
                }
            }
        }
        
        while (!operators.isEmpty()) {
            if (operators.get(0).equals("+")) {
                tmp = num.get(0) + num.get(1);
            } 
            else if(operators.get(0).equals("-")) {
                tmp = num.get(0) - num.get(1);
            }
            num.set(0, tmp);
            num.remove(1);
            operators.remove(0);
        }
        return num.get(0);
	}
	
}