package ¹ÚÀ¯¹Î;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PanelDemo_462 extends JFrame implements ActionListener{
	public PanelDemo_462() {
		super("test");
		initializeComponents();
	}
	private void initializeComponents() {
			Container c = getContentPane();
			
			JButton pushButton = new JButton("press me");
			c.add(pushButton);
			
		/*	addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent event) {
					System.exit(0);
				}
			}); */
			pushButton.addActionListener(this);
			
			setSize(200,200);
			setLocation(300,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		final char bell = '\u0041';
		if(event.getActionCommand().equals("press me")) {
			System.out.print(bell);
		}
	}
	public static void main(String[] args) {
		PanelDemo_462 app = new PanelDemo_462();
	}
}
