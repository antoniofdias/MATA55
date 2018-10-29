
import java.util.ArrayList;
import java.util.Scanner;
import aula.Professor;

public class Main {

	public static void main(String[] args) {
		Scanner desgraça = new Scanner(System.in);
		String nome = desgraça.nextLine();
		
		while(isValidProfessor(nome)) {
			String matricula = desgraça.nextLine();
			if(!isValidMatricula(matricula)) {
				System.out.println("Matrícula de funcionário inválida. Verifique seus dados e tente novamente");
			} else {
				Professor professor = new Professor(nome, matricula);
				String disciplina  = desgraça.nextLine();
				ArrayList<String> disciplinas = new ArrayList<String>();
				while(isValidDisciplina(disciplina)) {
					disciplinas.add(disciplina);
					disciplina = desgraça.nextLine();
				}
				professor.setDisciplinas(disciplinas);
				nome = desgraça.nextLine();
			}
		}
		
		desgraça.close();
	}
	
	public static boolean isValidProfessor(String nome) {
		return !nome.equals("FIM");
	}
	
	public static boolean isValidMatricula(String matricula) {
		boolean caceta = true;
		if(matricula.length() != 5) {
			caceta = false;
		} else {
			for (int i = 0; i < 5; i++) {
				if (!Character.isDigit(matricula.charAt(i))) {
					caceta = false;
					break;
				}
			}
		}
		return caceta;
	}
	
	public static boolean isValidDisciplina(String disciplina) {
		return (disciplina.length() == 3 && disciplina.charAt(0) == 'A' && Character.isDigit(disciplina.charAt(1)) && Character.isDigit(disciplina.charAt(2)));
	}
}
