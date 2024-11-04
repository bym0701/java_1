package 박유민;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventHandlingTest3 extends JFrame{
	public static void main(String[] args) {
		EventHandlingTest3 f = new EventHandlingTest3("무명 클래스");
	}
	public EventHandlingTest3(String title) {
		super(title);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = this.getContentPane();
		JButton b = new JButton("press me");
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("press me 버튼이 눌렸습니다.");
			}
		});
		
		c.add(b);
		
		this.setSize(200, 200);
		this.setLocation(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
