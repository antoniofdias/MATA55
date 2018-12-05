package data;

import javax.swing.*;
import java.awt.*;
public class ExLabel extends W_Frame {
	private static final long serialVersionUID = 1L;
	public ExLabel() {
		super();
		setTitle("Adicionando Rotulos");
		setBounds(200, 150, 400, 300);
		Font f = new Font("SansSerif", Font.BOLD + Font.ITALIC, 18);
		JLabel lb1 = new JLabel();
		lb1.setText("Java");
		lb1.setSize(250, 15);
		lb1.setFont(f);
		lb1.setLocation(60, 50);
		lb1.setForeground( Color.blue.darker());
		JLabel lb2 = new JLabel();
		lb2.setText("suxx");
		lb2.setBounds(80, 150, 300, 15);
		lb2.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lb2.setForeground( Color.red.darker());
		getContentPane().setLayout(null);
		getContentPane().add(lb1);
		getContentPane().add(lb2);
	}
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		new ExLabel().show();
	}
}