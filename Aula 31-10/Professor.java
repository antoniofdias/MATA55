package aula;

public class Professor extends Pessoa {
	private String disciplina;
	private String �reaAtua��o;
	
	public Professor(String nome, String endere�o, String disciplina, String �reaAtua��o) {
		super(nome, endere�o);
		this.disciplina = disciplina;
		this.�reaAtua��o = �reaAtua��o;
	}

	public String toString() {
		return "Prof. " + super.toString() + "Disciplina Lecionada: " + this.disciplina + "\n";
	}
	
	public String get�reaAtua��o() {
		return �reaAtua��o;
	}

	public void set�reaAtua��o(String �reaAtua��o) {
		this.�reaAtua��o = �reaAtua��o;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
