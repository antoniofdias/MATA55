package aula;

public class Pessoa {
	private String nome;
	private String enderešo;
	
	public Pessoa(String nome, String enderešo) {
		this.nome = nome;
		this.enderešo = enderešo;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Enderešo: " + this.enderešo + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

}
