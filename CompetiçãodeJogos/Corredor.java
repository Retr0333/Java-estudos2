package CompetiçãodeJogos;

public class Corredor extends Atleta
{
    double velocidade;
    public Corredor(String nome, double velocidade)
    {
        super(nome);
        this.velocidade = velocidade;
    }
    public double calcularResultado()
    {
        return velocidade * 10;
    }
}
