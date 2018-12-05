package data;

import javax.swing.*;
import java.awt.*;

public class W_Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	public W_Frame() {
		this.setTitle("Descobrindo JFrame");
		setBounds(200,150,400,300);
		getContentPane(). setBackground( Color .cyan.darker());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.red,3));
		//getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		setUndecorated(false);
	}
	public static void main(String args[]) {
		new	W_Frame().setVisible(true);
	}
}

