package data;

import javax.swing.*;
import java.awt.*;
public class ExJTextField extends W_Frame {
	private static final long serialVersionUID = 1L;
	public JTextField tx1, tx2;
	public JLabel l1, l2, l3;
	public ExJTextField() {
		setTitle("Formulário Semcomp");
		setBounds(200,150,400,300);
		Font f1 = new Font("SansSerif",Font.ITALIC,14);
		Font f2 = new Font("SansSerif",Font.ITALIC,10);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1 = new JLabel();
		l1.setText("Ficha de Cadastro");
		l1.setBounds(150, 25, 200, 15);
		l2 = new JLabel("Digite seu Nome :");
		l2.setFont(f1);
		l2.setForeground(Color.black);
		l2.setBounds(10,50,120,15);
		tx1 = new JTextField();
		tx1.setFont(f2);
		tx1.setText("Seu Nome :");
		tx1.setLocation(140,50);
		tx1.setSize(200,20);
		l3 = new JLabel("Digite seu e-mail :");
		l3.setFont(f1);
		l3.setForeground(Color.black);
		l3.setBounds(10,90,120,15);
		tx2 = new JTextField("Seu e-mail :" );
		tx2.setFont(f2);
		tx2.setBackground(Color.yellow);
		tx2.setForeground(Color.red);
		tx2.setBounds(140, 90, 200, 20);
		tx2.setToolTipText("Use apenas letras minúsculas");
		getContentPane().setLayout(null);
		getContentPane().add(l1);
		getContentPane().add(l2);
		getContentPane().add(l3);
		getContentPane().add(tx1);
		getContentPane().add(tx2);
	}
	@SuppressWarnings("deprecation")
	public static void main(String args[]){
		new ExJTextField().show();
	}
}