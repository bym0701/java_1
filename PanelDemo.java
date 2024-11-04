package ¹ÚÀ¯¹Î;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PanelDemo extends JFrame{
	public PanelDemo() {
		super("test");
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = getContentPane();
		c.setBackground(Color.yellow);
		c.setLayout(new FlowLayout());
		JButton pushButton = new JButton("press me");
		c.add(pushButton);
		
		EventHandler evtHandler = new EventHandler();
		addWindowListener(evtHandler);
		pushButton.addActionListener(evtHandler);
		
		setSize(200,200);
		setLocation(300,300);
		setVisible(true);
		
	}
	public static void main(String args[]) {
		PanelDemo app = new PanelDemo();
	}
}
class EventHandler extends WindowAdapter implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		final char bell = '\u0007';
		if(event.getActionCommand().contentEquals("Press me")){
			System.out.print(bell);
		}
	}
	public void windowClosing(WindowEvent event) {
		System.exit(0);
	}
}