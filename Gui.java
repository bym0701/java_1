package ¹ÚÀ¯¹Î;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui extends JFrame implements ActionListener, WindowListener{
	public Gui(String s) {
		super(s);
		initializeComponents();
	}
	private void initializeComponents() {
		Container c = getContentPane();
		
		JButton b = new JButton("press me");
		c.add(b);
		b.addActionListener(this);
		addWindowListener(this);
		
		this.setSize(200,200);
		this.setLocation(300,300);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		final String bell = "¶ò¶ò¶ò";
		if(event.getActionCommand().equals("press me")) {
			System.out.print(bell);
		}
	}
	public void windowClosing(WindowEvent event) {System.exit(0);}
	public void windowClosed(WindowEvent event) {}
	public void windowDeiconified(WindowEvent event) {}
	public void windowIconified(WindowEvent event) {}
	public void windowActivated(WindowEvent event) {}
	public void windowDeactivated(WindowEvent event) {}
	public void windowOpened(WindowEvent event) {}
	
	public static void main(String[] args) {
		Gui app = new Gui("test");
	}
}
