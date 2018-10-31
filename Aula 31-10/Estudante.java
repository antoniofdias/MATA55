package aula;

public class Estudante extends Pessoa {
	public String nomeEscola;
	public String s�rie;
	
	public Estudante(String nome, String endere�o, String nomeEscola, String s�rie) {
		super(nome, endere�o);
		this.nomeEscola = nomeEscola;
		this.s�rie = s�rie;
	}
	
	public String toString() {
		return super.toString() + "Nome da Escola: " + this.nomeEscola + "\n" + "S�rie: " + s�rie + "\n";
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getS�rie() {
		return s�rie;
	}

	public void setS�rie(String s�rie) {
		this.s�rie = s�rie;
	}
}
