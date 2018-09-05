
/**
 * Escreva a descrição da classe Triangulo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Triangulo
{
    // variáveis de instância
    private double lado1;
    private double lado2;
    private double lado3;

    /**
     * Construtor para objetos da classe Triangulo
     */
    public Triangulo(double novoLado1, double novoLado2, double novoLado3)
    {
        // inicializa variáveis de instância
        lado1 = novoLado1;
        lado2 = novoLado2;
        lado3 = novoLado3;
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public boolean éEquilatero()
    {
        // ponha seu código aqui
        return (lado1 == lado2 && lado2 == lado3);
    }
}
