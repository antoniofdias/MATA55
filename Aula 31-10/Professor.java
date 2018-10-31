package aula;

public class Professor extends Pessoa {
	private String disciplina;
	private String áreaAtuação;
	
	public Professor(String nome, String endereço, String disciplina, String áreaAtuação) {
		super(nome, endereço);
		this.disciplina = disciplina;
		this.áreaAtuação = áreaAtuação;
	}

	public String toString() {
		return "Prof. " + super.toString() + "Disciplina Lecionada: " + this.disciplina + "\n";
	}
	
	public String getÁreaAtuação() {
		return áreaAtuação;
	}

	public void setÁreaAtuação(String áreaAtuação) {
		this.áreaAtuação = áreaAtuação;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
