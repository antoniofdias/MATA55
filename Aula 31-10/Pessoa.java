package aula;

public class Pessoa {
	private String nome;
	private String endere�o;
	
	public Pessoa(String nome, String endere�o) {
		this.nome = nome;
		this.endere�o = endere�o;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Endere�o: " + this.endere�o + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

}
