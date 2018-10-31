package aula;

public class Pessoa {
	private String nome;
	private String endereço;
	
	public Pessoa(String nome, String endereço) {
		this.nome = nome;
		this.endereço = endereço;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Endereço: " + this.endereço + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
