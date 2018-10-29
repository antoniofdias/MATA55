package aula;
import java.util.ArrayList;

public class Professor {
	private String nome, matricula;
	private ArrayList<String> disciplinas;
	
	public Professor(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.disciplinas = new ArrayList<String>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public ArrayList<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<String> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
