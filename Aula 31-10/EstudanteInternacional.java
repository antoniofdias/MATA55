package aula;

public class EstudanteInternacional extends Estudante {
	private String pa�s;

	public EstudanteInternacional(String nome, String endere�o, String nomeEscola, String s�rie, String pa�s) {
		super(nome, endere�o, nomeEscola, s�rie);
		this.pa�s = pa�s;
	}
	
	public String toString() {
		return super.toString() + "Pa�s de Origem: " + this.pa�s + "\n";
	}

	public String getPa�s() {
		return pa�s;
	}

	public void setPa�s(String pa�s) {
		this.pa�s = pa�s;
	}
	
}
