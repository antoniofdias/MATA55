
/**
 * Escreva a descrição da classe SetorPessoal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class SetorPessoal
{
    private Funcionario[] vetFunc;
    private int numeroFuncionarios;
    private boolean status;

    /**
     * Construtor para objetos da classe SetorPessoal
     */
    public SetorPessoal(int numeroMaxFuncionarios)
    {
        if (numeroMaxFuncionarios <= 100) {
            this.vetFunc = new Funcionario[numeroMaxFuncionarios];
            this.numeroFuncionarios = 0;
            this.status = true;
        }
        else
            this.status = false;
    }

    /**
     * Contrata um funcionário DE
     */
    public void contrataDE(String nome, int numeroMatricula, String funcao, String departamento, double salario)
    {
        if (numeroFuncionarios < vetFunc.length)
        {
            vetFunc[this.numeroFuncionarios] = new Funcionario(nome, numeroMatricula, funcao, departamento, salario);
            this.numeroFuncionarios++;
        }
    }

    /**
     * Contrata um funcionário temp
     */
    public void contrataTemp(Funcionario newFuncionario)
    {
        if (numeroFuncionarios < vetFunc.length)
        {
            vetFunc[this.numeroFuncionarios] = newFuncionario;
            this.numeroFuncionarios++;
        }
    }
    
    public void imprimeFolha()
    {
        int i;
        System.out.println("********** Folha de Pagamentos **********");
        for (i = 0; i < numeroFuncionarios; i++)
        {
            System.out.println("Nome = " + vetFunc[i].getNome() + " Salário = " + vetFunc[i].getSalario());
        }
    }
}
