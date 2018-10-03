
/**
 * Escreva a descrição da classe SetorPessoal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.ArrayList;

public class SetorPessoal
{
    ArrayList <Funcionario> f;

    /**
     * COnstrutor para objetos da classe SetorPessoal
     */
    public SetorPessoal()
    {
        f = new ArrayList<Funcionario>();
    }
    
    public void contrataFuncionario(String nome, int matricula,
    String funcao, String departamento, double salario)
    {
        f.add(new Funcionario (nome, matricula, funcao, departamento, salario));
    }
    
    public void demiteFuncionario(String matricula)
    {
        for (int i = 0; i < f.size(); i++)
        {
            if (matricula == f.get(i).getMatricula())
            {
                f.remove(i);
            }
        }
    }
    
    public double consultaSalario(String nome)
    {
        for (int i = 0; i < f.size(); i++)
        {
            if (nome == f.get(i).getNome())
            {
                return (f.get(i).getSalario());
            }
        }
        return 0;
    }
}
