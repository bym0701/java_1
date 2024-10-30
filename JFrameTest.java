package ¹ÚÀ¯¹Î;

import javax.swing.JFrame;

public class JFrameTest extends JFrame{
	public static void main(String[] args) {
		JFrameTest window = new JFrameTest();
		
		window.setSize(400, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	public JFrameTest() {
		super("test");
	}
}
