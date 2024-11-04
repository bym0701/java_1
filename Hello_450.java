package 박유민;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hello_450 extends JFrame implements ActionListener {
	JButton b1, b2;
	public static void main(String[] args) {
		Hello_450 f = new Hello_450("title");
	}
	public Hello_450(String title) {
		super(title);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		b1 = new JButton("press me");
		b2 = new JButton("click me");
		b1.addActionListener(this);
		b2.addActionListener(this);
		c.add(b1);
		c.add(b2);
		
		this.setSize(200,200);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
	}
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == b1)
			System.out.println("첫 번째 버튼이 눌렸습니다.");
		else if (event.getSource() == b2)
			System.out.println("두 번째 버튼이 눌렸습니다.");
	}
}
