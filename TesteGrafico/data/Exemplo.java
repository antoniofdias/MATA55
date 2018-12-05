package data;

import javax.swing.*;
import java.awt.*;
public class Exemplo extends JFrame {
	private static final long serialVersionUID = 1L;
	public Exemplo()
	{ 
// método construtor
		setTitle ("Primeira Tela");
		setResizable(false );
		setSize (400,300);
		setLocation (100,100);
		getContentPane().setBackground(Color.red);
	}
	@SuppressWarnings("deprecation")
	public static void main (String[] args) {
		Exemplo	tela = new Exemplo(); 
		// instancia o objeto tela
		tela.show();
		// exibe a tela 
	}
}