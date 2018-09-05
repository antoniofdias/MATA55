
/**
 * Escreva a descrição da classe Filme aqui.
 * 
 * @author (Gabonagy) 
 * @version (0509)
 */
public class Filme
{
    // variáveis de instância
    private String titulo;
    private String ator;
    private int lancamento;
    private int qtdCopias;

    /**
     * Construtor para objetos da classe Filme
     */
    public Filme(String novoTitulo, String novoAtor, int novoLancamento, int novoQtdCopias)
    {
        // inicializa variáveis de instância
        titulo = novoTitulo;
        ator = novoAtor;
        lancamento = novoLancamento;
        qtdCopias = novoQtdCopias;
        
    }
    
    /**
     * Exemplo de método
     */
    public void locar()
    {
        qtdCopias--;
    }

    /**
     * Exemplo de método
     */
    public void devolver()
    {
        qtdCopias = qtdCopias + 1;
    }
    
    
}
