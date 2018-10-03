
/**
 * @author Gabonio
 * @version 26/09/2018
 */
public class Funcionario
{
    private String nome, matricula;
    private String funcao, departamento;
    private double salario;

    /**
     * Construtor para objetos da classe Funcionario
     */
    public Funcionario(String nome, int matricula, String funcao, String departamento, double salario)
    {
        this.nome = nome;
        this.matricula = Integer.toString(matricula);
        this.funcao = funcao;
        this.departamento = departamento;
        this.salario = salario;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public double getSalario()
    {
        return this.salario;
    }
    
    public String getMatricula()
    {
        return this.matricula;
    }
}
