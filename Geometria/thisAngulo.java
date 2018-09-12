
/**
 * Escreva a descrição da classe thisAngulo aqui.
 * 
 * @author Gabonajonio 
 * @version (número de versão ou data)
 */
public class thisAngulo
{
    private double ladoA;
    private double ladoB;
    private double ladoC;

    /**
     * Construtor para objetos da classe thisAngulo
     */
    public thisAngulo(double ladoA)
    {
        this(ladoA, ladoA);
    }

    /**
     * Construtor para objetos da classe thisAngulo
     */
    public thisAngulo(double ladoA, double ladoB)
    {
        this(ladoA, ladoA, ladoB);
    }

    /**
     * Construtor para objetos da classe thisAngulo
     */
    public thisAngulo(double ladoA, double ladoB, double ladoC)
    {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

}
