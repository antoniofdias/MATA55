package aula;

public class EstudanteInternacional extends Estudante {
	private String país;

	public EstudanteInternacional(String nome, String endereço, String nomeEscola, String série, String país) {
		super(nome, endereço, nomeEscola, série);
		this.país = país;
	}
	
	public String toString() {
		return super.toString() + "País de Origem: " + this.país + "\n";
	}

	public String getPaís() {
		return país;
	}

	public void setPaís(String país) {
		this.país = país;
	}
	
}
