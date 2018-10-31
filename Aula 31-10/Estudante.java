package aula;

public class Estudante extends Pessoa {
	public String nomeEscola;
	public String série;
	
	public Estudante(String nome, String endereço, String nomeEscola, String série) {
		super(nome, endereço);
		this.nomeEscola = nomeEscola;
		this.série = série;
	}
	
	public String toString() {
		return super.toString() + "Nome da Escola: " + this.nomeEscola + "\n" + "Série: " + série + "\n";
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSérie() {
		return série;
	}

	public void setSérie(String série) {
		this.série = série;
	}
}
