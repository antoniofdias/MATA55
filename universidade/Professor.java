
/**
 * Escreva a descrição da classe Professor aqui.
 * 
 * @author Gabonagy
 * @version 12/09/2018
 */
public class Professor
{
    private String nome;
    private String departamento;
    private String admissao;

    /**
     * Construtor para objetos da classe Professor
     */
    public Professor(String nome, String departamento)
    {
        this(nome, departamento, "01/01/2009");
    }
    
    public Professor(String nome, String departamento, String admissao)
    {
        this.nome = nome;
        this.departamento = departamento;
        this.admissao = admissao;
    }

    public void setDepartamento(String dp)
    {
        this.departamento = dp;
    }
    
    public void setDepartamento(int dept)
    {
        String dp = "Departamento de ";
        switch (dept) {
            case 1:
                this.setDepartamento (dp + "Ciência da Computação");
                break;
            case 2:
                this.setDepartamento (dp + "Matemática");
                break;
            case 3:
                this.setDepartamento (dp + "Estatística");
                break;
            default:
                this.setDepartamento(dp + "Desconhecido");
        }
    }
}
